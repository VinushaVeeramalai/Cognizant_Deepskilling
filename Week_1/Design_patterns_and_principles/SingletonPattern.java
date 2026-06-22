package Week_1.Design_patterns_and_principles;;

class Logger {
    
    private static Logger instance;


    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

// Test class
public class SingletonPattern {
    public static void main(String[] args) {

        System.out.println("=== Singleton Logger ===\n");

        
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        
        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");

        // Verify both are same
        System.out.println("\nSame instance? " + (logger1 == logger2));
        System.out.println("Logger1 hashcode: " + logger1.hashCode());
        System.out.println("Logger2 hashcode: " + logger2.hashCode());
    }
}