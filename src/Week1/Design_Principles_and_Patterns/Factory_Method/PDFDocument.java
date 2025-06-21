package Week1.Design_Principles_and_Patterns.Factory_Method;

public class PDFDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}