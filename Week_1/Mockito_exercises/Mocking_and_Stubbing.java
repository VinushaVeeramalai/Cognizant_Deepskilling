package Week_1.Mockito_exercises;
import java.util.Scanner;

// Scenario: Test a WeatherService that depends on external WeatherAPI
// Mock = fake the API so we don't need real internet connection

// External API interface
interface WeatherApi {
    String getWeather(String city);
}

// Service that uses the API
class WeatherService {
    private WeatherApi api;

    WeatherService(WeatherApi api) {
        this.api = api;
    }

    public String fetchWeather(String city) {
        return api.getWeather(city);
    }
}

// Mock - fake API with predefined return values (stubbing)
class MockWeatherApi implements WeatherApi {
    public String getWeather(String city) {
        if (city.equals("Chennai"))  return "Sunny, 35°C";
        if (city.equals("Mumbai"))   return "Rainy, 28°C";
        return "No data available";
    }
}

public class Mocking_and_Stubbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mocking and Stubbing Demo ===\n");

        // Create mock instead of real API
        WeatherApi mockApi = new MockWeatherApi();
        WeatherService service = new WeatherService(mockApi);

        System.out.print("Enter city name : ");
        String city = sc.nextLine();

        String result = service.fetchWeather(city);
        System.out.println("Weather Result  : " + result);
        System.out.println("\nMock returned data without calling real API!");

        sc.close();
    }
}