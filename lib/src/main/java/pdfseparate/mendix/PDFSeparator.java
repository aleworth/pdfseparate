package pdfseparate.mendix;/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface PDFSeparator {

    List<PDDocument> splitPDF(File pdf) throws IOException;
    List<File> saveFile(final List<PDDocument> pages, final String fileName) throws IOException;
    List<File> splitAndSave(final File pdf, final String fileName) throws IOException;
    //Tests
    int splitPDFTest(File pdf) throws IOException;
    int fullSplitTest(File pdf) throws IOException;

    static PDFSeparator create() {
        return new SeparatorHelper();
    }
}
