package org.duna.newnumberformatclass;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NewNumberFormatClassDemo01 {
  public static void main(String[] args) {

    NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(
      new Locale("en", "US"),
      NumberFormat.Style.SHORT
    );
    numberFormat.setMaximumFractionDigits(2);
    String number = numberFormat.format(5430000);
    System.out.println(number);

    NumberFormat numberFormat2 = CompactNumberFormat.getCompactNumberInstance(
      Locale.US,
      CompactNumberFormat.Style.SHORT
    );
    numberFormat2.setMaximumFractionDigits(2);
    String number2 = numberFormat2.format(5430000);
    System.out.println(number2);
  }
}
