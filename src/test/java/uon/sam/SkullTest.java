package uon.sam;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// copied from http://www.vogella.com/tutorials/JUnit/article.html
public class SkullTest {

  @Test
  public void createSkull() {
    Skull tester = new Skull();

    // assert statements
    assertEquals("bone", tester.name);
  }

    @Test
    public void renmaeSkull() throws Exception {

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
