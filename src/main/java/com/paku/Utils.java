package com.paku;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Utils {

  public static List<Integer> generateRandomNumbers(long size) {
    return ThreadLocalRandom.current().ints(size).boxed().collect(Collectors.toList());
  }

  public static List<Integer> generateRandomNumbers(long size, int start, int end) {
    return ThreadLocalRandom.current().ints(size, start, end).boxed().collect(Collectors.toList());
  }

  public static int generateRandomNumber(int start, int end) {
    return ThreadLocalRandom.current().nextInt(start, end);
  }
}
