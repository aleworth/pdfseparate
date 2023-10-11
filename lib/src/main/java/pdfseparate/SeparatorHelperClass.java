package pdfseparate;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;

class SeparatorHelper implements PDFSeparator {

    @java.lang.Override
    public List<PDDocument> splitPDF(File pdf) {
        PDDocument document = PDDocument.load(pdfFile);

        // Splitter Class
        Splitter splitting = new Splitter();

        // Splitting the pages into multiple PDFs
        List<PDDocument> Pages = splitting.split(document);
        return Pages;
    }

    public Integer splitPDFTest(File pdf) {
        PDDocument document = PDDocument.load(pdfFile);

        // Splitter Class
        Splitter splitting = new Splitter();

        // Splitting the pages into multiple PDFs
        List<PDDocument> Pages = splitting.split(document);
        return Pages.size();
    }
}