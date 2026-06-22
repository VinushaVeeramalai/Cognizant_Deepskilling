package Week_1;
// Factory Method Pattern - Document Management System
interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document (.docx)");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document (.pdf)");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document (.xlsx)");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() { return new WordDocument(); }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() { return new PdfDocument(); }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() { return new ExcelDocument(); }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {

        System.out.println("=== Document Management System ===\n");

        DocumentFactory factory1 = new WordFactory();
        Document doc1 = factory1.createDocument();
        doc1.open();

        DocumentFactory factory2 = new PdfFactory();
        Document doc2 = factory2.createDocument();
        doc2.open();

        DocumentFactory factory3 = new ExcelFactory();
        Document doc3 = factory3.createDocument();
        doc3.open();

        System.out.println("\nAll documents created using Factory Method!");
    }
}


