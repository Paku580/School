package com.paku.sortingalgorithms;

import java.util.Collections;
import java.util.List;

public class QuickSort extends SortingAlgorithm {

  public QuickSort(List<Integer> sortingData) {
    super(sortingData);
  }

  @Override
  public void sort() {
    sort(0, sortingData.size()-1);
  }

  private void sort(int low, int high) {
    if (low < high) {
      int p = partition(low, high);
      sort(low, p);
      sort(p + 1, high);
    }
  }

  private int partition(int low, int high) {
    int pivot = sortingData.get(low + (high - low) / 2);
    int i = low - 1;
    int j = high + 1;

    while (true) {
      do {
        i++;
      } while (sortingData.get(i) < pivot);
      do {
        j--;
      } while (sortingData.get(j) > pivot);
      if (i >= j) {
        return j;
      }
      Collections.swap(sortingData, i, j);
    }
  }
}
