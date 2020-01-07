package com.paku.sortingalgorithms;

import com.paku.Utils;

import java.util.List;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    List<Integer> numbers = Utils.generateRandomNumbers(30);
    System.out.println(numbers);
    System.out.println("""
            Please select a sorting algorithm:
            1: Bubble sort
            2: Insertion sort
            3: Selection sort
            4: Quick sort
            5: Merge sort""");

    Scanner scanner = new Scanner(System.in);

    switch (Sort.values()[scanner.nextInt() - 1]) {
      case BUBBLESORT -> new BubbleSort(numbers).sort();
      case INSERTIONSORT -> new InsertionSort(numbers).sort();
      case SELECTIONSORT -> new SelectionSort(numbers).sort();
      case QUICKSORT -> new QuickSort(numbers).sort();
      case MERGESORT -> new MergeSort(numbers).sort();
    }
    System.out.println(numbers);
  }
}
