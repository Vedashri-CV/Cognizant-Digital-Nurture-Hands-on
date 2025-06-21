package Week1.Design_Principles_and_Patterns.Factory_Method;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}