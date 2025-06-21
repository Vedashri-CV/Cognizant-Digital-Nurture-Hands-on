package Week1.Design_Principles_and_Patterns.Factory_Method;

public class DocumentTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory PDFFactory = new PDFDocumentFactory();
        Document PDFDoc = PDFFactory.createDocument();
        PDFDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
