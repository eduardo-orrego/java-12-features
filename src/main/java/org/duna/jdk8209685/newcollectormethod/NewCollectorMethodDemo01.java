package org.duna.jdk8209685.newcollectormethod;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewCollectorMethodDemo01 {
  public static void main(String[] args) {
    /*
    Collectors.teeing() .-
    Returns a Collector that is a composite of two downstream collectors.
    Every element passed to the resulting collector is processed by both downstream collectors,
    then their results are merged using the specified merge function into the final result.
     */
    double mean = Stream.of(1, 2, 3, 4, 5)
      .collect(Collectors.teeing(
          Collectors.summingDouble(i -> i),
          Collectors.counting(),
          (sum, count) -> sum / count
        )
      );

    System.out.println(mean);

  }
}
