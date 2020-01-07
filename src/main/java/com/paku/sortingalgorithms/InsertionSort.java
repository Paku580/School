package com.paku.sortingalgorithms;

import java.util.Collections;
import java.util.List;

public class InsertionSort extends SortingAlgorithm {

  public InsertionSort(List<Integer> sortingData) {
    super(sortingData);
  }

  @Override
  void sort() {
    for (int i = 1; i < sortingData.size(); i++) {
      int j = i;
      while (j > 0 && sortingData.get(j) < sortingData.get(j - 1)) {
        Collections.swap(sortingData, j, j-1);
        j--;
      }
    }
  }
}
