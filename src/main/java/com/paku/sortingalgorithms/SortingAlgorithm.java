package com.paku.sortingalgorithms;

import java.util.List;

public abstract class SortingAlgorithm {

  protected List<Integer> sortingData;

  public SortingAlgorithm(List<Integer> sortingData) {
    this.sortingData = sortingData;
  }

  abstract void sort();
}
