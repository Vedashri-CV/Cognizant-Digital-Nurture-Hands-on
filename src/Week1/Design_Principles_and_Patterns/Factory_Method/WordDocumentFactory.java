package Week1.Design_Principles_and_Patterns.Factory_Method;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
