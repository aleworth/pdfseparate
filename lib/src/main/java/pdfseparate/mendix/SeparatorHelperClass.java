package pdfseparate.mendix;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
            //document.close();

            return Pages;
        } catch (Exception e) {
            throw(e);
        }
    }

    @java.lang.Override
    public List<File> saveFile(final List<PDDocument> pages, final String fileName) throws IOException {
        try {
            final Iterator<PDDocument> iteration = pages.listIterator();
            final List<File> newFiles = new ArrayList<>();
            // Saving each page as an individual document
            int j = 1;
            while (iteration.hasNext()) {
                PDDocument pd = iteration.next();
                File pdfFileOutput = new File(fileName + "-" + j++ + ".pdf");
                pd.save(pdfFileOutput);
                newFiles.add(pdfFileOutput);
            }

            return newFiles;
        } catch (Exception e) {
            throw e;
        }
    }

    @java.lang.Override
    public List<File> splitAndSave(final File pdf, final String fileName) throws IOException {
        try {

            PDDocument document = PDDocument.load(pdf);

            // Splitter Class
            Splitter splitting = new Splitter();

            // Splitting the pages into multiple PDFs
            List<PDDocument> pages = splitting.split(document);

            final Iterator<PDDocument> iteration = pages.listIterator();
            final List<File> newFiles = new ArrayList<>();
            // Saving each page as an individual document
            int j = 1;
            while (iteration.hasNext()) {
                PDDocument pd = iteration.next();
                File pdfFileOutput = new File(fileName + "-" + j++ + ".pdf");
                pd.save(pdfFileOutput);
                newFiles.add(pdfFileOutput);
            }

            document.close();
            return newFiles;
        } catch (Exception e) {
            throw e;
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

    public int fullSplitTest(File pdf) throws IOException {
        try {
            List<PDDocument> testDocumentList = splitPDF(pdf);
            String testString = "testDoc";
            List<File> testFileList = saveFile(testDocumentList, testString);
            return testFileList.size();
        } catch (Exception e) {
            throw (e);
        }
    }
}