package com.paku.sortingalgorithms;

import java.util.Collections;
import java.util.List;

public class SelectionSort extends SortingAlgorithm {

  public SelectionSort(List<Integer> sortingData) {
    super(sortingData);
  }

  @Override
  void sort() {
    for (int i = 0; i < sortingData.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < sortingData.size(); j++) {
        if (sortingData.get(j) < sortingData.get(minIndex)) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        Collections.swap(sortingData, i, minIndex);
      }
    }
  }
}
