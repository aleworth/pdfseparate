/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pdfseparate.mendix;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class SeparatorTest {
    @Test public void coreFunctionalityTest() throws IOException {
        File testFile = new File("C:/Users/Austin/Downloads/Orlando ASUG 10-20-23.pdf");
        PDFSeparator separator = PDFSeparator.create();
        int assertionValue = 19;
        assertEquals(assertionValue, separator.splitPDFTest(testFile));
    }

    @Test public void fullFunctionalityTest() throws IOException {
        File testFile = new File("C:/Users/Austin/Downloads/Orlando ASUG 10-20-23.pdf");
        PDFSeparator separator = PDFSeparator.create();
        int assertionValue = 19;
        assertEquals(assertionValue, separator.fullSplitTest(testFile));
    }
}
