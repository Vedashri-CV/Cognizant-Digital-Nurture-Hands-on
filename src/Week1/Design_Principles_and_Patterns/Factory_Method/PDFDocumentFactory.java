package Week1.Design_Principles_and_Patterns.Factory_Method;

public class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}