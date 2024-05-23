package org.duna.newstringmethod;

public class NewStringMethodDemo01 {
  public static void main(String[] args){
    String text = "Java 12 features\nString Class\nindent method";

    text = text.indent(4);
    System.out.println(text);

    text = text.indent(-3);
    System.out.println(text);

    text = text.indent(-5);
    System.out.println(text);
  }
}
