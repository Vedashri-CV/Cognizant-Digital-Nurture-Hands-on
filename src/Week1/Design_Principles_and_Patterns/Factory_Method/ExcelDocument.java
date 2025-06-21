package Week1.Design_Principles_and_Patterns.Factory_Method;

public class ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}