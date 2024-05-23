package org.duna.jdk8203703.newstringmethod;

public class NewStringMethodDemo02 {
  public static void main(String[] args){
    String text = "Java 12 features";
    String transformed = text.transform(value ->
      new StringBuilder(value).reverse().toString()
    );
    System.out.println(transformed);
  }
}
