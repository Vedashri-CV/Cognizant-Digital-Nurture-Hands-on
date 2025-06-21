package Week1.Design_Principles_and_Patterns.Factory_Method;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}