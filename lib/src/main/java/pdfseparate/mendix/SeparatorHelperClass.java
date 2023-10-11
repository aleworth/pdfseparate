package pdfseparate.mendix;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

class SeparatorHelper implements PDFSeparator {

    @java.lang.Override
    public List<PDDocument> splitPDF(final File pdf) throws IOException {
        try {
            PDDocument document = PDDocument.load(pdf);

            // Splitter Class
            Splitter splitting = new Splitter();

            // Splitting the pages into multiple PDFs
            List<PDDocument> Pages = splitting.split(document);
            return Pages;
        } catch (Exception e) {
            throw(e);
        }

    }

    public int splitPDFTest(File pdf) throws IOException {
        try {
            PDDocument document = PDDocument.load(pdf);

            // Splitter Class
            Splitter splitting = new Splitter();

            // Splitting the pages into multiple PDFs
            List<PDDocument> Pages = splitting.split(document);
            return Pages.size();
        } catch (Exception e) {
            throw (e);
        }
    }
}