package com.paku.sortingalgorithms;

import java.util.Collections;
import java.util.List;

public class BubbleSort extends SortingAlgorithm {


  public BubbleSort(List<Integer> sortingData) {
    super(sortingData);
  }

  @Override
  public void sort() {
    boolean sorted;
    do {
      sorted = true;
      int n = sortingData.size();
      for (int i = 0; i < n - 1; i++) {
        if (sortingData.get(i + 1) < sortingData.get(i)) {
          sorted = false;
          Collections.swap(sortingData, i, i + 1);
          n--;
        }
      }
    } while (!sorted);
  }
}
