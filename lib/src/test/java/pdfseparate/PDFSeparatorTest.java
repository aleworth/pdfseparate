/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pdfseparate;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void coreFunctionalityTest() {
        File testFile = new File("C:/Users/Austin/Downloads/Orlando ASUG 10-20-23.pdf");
        PDFSeparator separator = PDFSeparator.create();
        assertEquals(19, separator.splitPDFTest(testFile));
    }
}