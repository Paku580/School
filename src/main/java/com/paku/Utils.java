package com.paku;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Utils {

  public static List<Integer> generateRandomNumbers(long size) {
    return ThreadLocalRandom.current().ints(size, 0, 101).boxed().collect(Collectors.toList());
  }
}