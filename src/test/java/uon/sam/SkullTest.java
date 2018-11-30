package uon.sam;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SkullTest extends TestCase {

    public void testCreateSkull() {
        Skull tester = new Skull();

        // assert statements
        assertEquals("bone", tester.name);
    }

    public void testRenameSkull() throws Exception {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Skull tester = new Skull();

        tester.name = "clikety-clak";

        tester.print(new PrintStream(outputStream));

        // assert statements
        assertEquals(
                "I'm just a skull, which is a type of `clikety-clak`",
                new String(outputStream.toByteArray(), "UTF-8")
        );
    }
}
