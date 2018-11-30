package uon.sam;

import java.io.PrintStream;

public class Skull {
  public String name = "bone";

	public int foo = -2;

  public void print() {
    print(System.out);
  }

  public void print(PrintStream out) {
    out.println("I'm just a skull, which is a type of `" + name + "`");
  }
}
