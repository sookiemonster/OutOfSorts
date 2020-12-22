import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Tester {
  public static void main(String[] args) {
    // int[] a = {2, 3, 6 , 4, 1, 0};
    // Sorts.bubbleSort(a);
    // System.out.println(Arrays.toString(a));
    //
    // int[] b = {1, 2, 3};
    // Sorts.bubbleSort(b);
    // System.out.println(Arrays.toString(b));
    //
    // int[] c = {1, 1, 2, 4, 3, 3, 0, 0};
    // Sorts.bubbleSort(c);
    // System.out.println(Arrays.toString(c));
    //
    // int[] d = {1, 2, 3, 4};
    // Sorts.bubbleSort(d);
    // System.out.println(Arrays.toString(d));
    //
    // int[] e = {7, 6, 5, 4};
    // Sorts.bubbleSort(e);
    // System.out.println(Arrays.toString(e));

    // bubbleTest(10);
    // bubbleTest(0);
    // bubbleTest(1);
    // bubbleTest(2);
    bubbleTest(20);

    // SELECTION SORT ------------------------------

    // System.out.println();
    // System.out.println("Selection Sort Test: \n");
    //
    // int[] ss = {2, 3, 6 , 4, 1, 0};
    // System.out.println(Arrays.toString(ss));
    // Sorts.selectionSort(ss);
    // System.out.println(Arrays.toString(ss));
    // Sorts.selectionSort(ss);
    // System.out.println(Arrays.toString(ss));
    //
    // int[] sa = {7, 6, 5, 4, 3, 2};
    // System.out.println(Arrays.toString(sa));
    // Sorts.selectionSort(sa);
    // System.out.println(Arrays.toString(sa));

    selectionTest(20);

    // SELECTION SORT ------------------------------

    // int[] a = {4, 3, 2, 1};
    // System.out.println(Arrays.toString(a));
    // Sorts.insertionSort(a);
    // System.out.println(Arrays.toString(a));

    insertionTest(20);
  }

  public static int[] randArray(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++) {
      int randNum =(int)(Math.random()*1000);
      arr[i] = randNum;
    }
    return arr;
  }

  public static int[] randSorted(int len) {
    int[] x = randArray(len);
    Arrays.sort(x);
    return x;
  }

  public static int[] randReverse(int len) {
    int[] x = randSorted(len);
    ArrayList<Integer> ar = new ArrayList<Integer>(len);
    for (int i = (x.length - 1); i >= 0; i--) {
      ar.add(x[i]);
    }
    int[] result = new int[ar.size()];
    for (int i = 0; i < ar.size(); i++) {
      result[i] = ar.get(i);
    }
    return result;
  }

  public static void checkCorrect(int[] x, int[] y, String test) {
    if (Arrays.equals(x, y)) {
      System.out.println(test + " correct!");
      // System.out.println(Arrays.toString(x));
      // System.out.println(Arrays.toString(y));
      // System.out.println();
    } else {
      System.out.println(test + " incorrect! NONONONONONO");
      System.out.println(Arrays.toString(x));
      System.out.println(Arrays.toString(y));
      System.out.println();
    }
  }

  public static void bubbleTest(int len) {
    System.out.println();
    System.out.println("Bubble Test:");


    // Random Array Sort
    int[] a1 = randArray(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a1) + "\n");
    int[] a1check = Arrays.copyOf(a1, a1.length);
    Arrays.sort(a1check);
    Sorts.bubbleSort(a1);
    checkCorrect(a1, a1check, "Random Array Sort");

    // Random Sorted Array Sort
    int[] a2 = randSorted(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a2) + "\n");
    int[] a2check = Arrays.copyOf(a2, a2.length);
    Arrays.sort(a2check);
    Sorts.bubbleSort(a2);
    checkCorrect(a2, a2check, "Random Sorted Array");

    // Random Reverse Sorted Array Sort
    int[] a3 = randReverse(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a3) + "\n");
    int[] a3check = Arrays.copyOf(a3, a3.length);
    Arrays.sort(a3check);
    Sorts.bubbleSort(a3);
    checkCorrect(a3, a3check, "Random Reverse Sorted Array");
  }

  public static void selectionTest (int len) {
    System.out.println();
    System.out.println("Selection Test:");


    // Random Array Sort
    int[] a1 = randArray(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a1) + "\n");
    int[] a1check = Arrays.copyOf(a1, a1.length);
    Arrays.sort(a1check);
    Sorts.selectionSort(a1);
    checkCorrect(a1, a1check, "Random Array Sort");

    // Random Sorted Array Sort
    int[] a2 = randSorted(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a2) + "\n");
    int[] a2check = Arrays.copyOf(a2, a2.length);
    Arrays.sort(a2check);
    Sorts.selectionSort(a2);
    checkCorrect(a2, a2check, "Random Sorted Array");

    // Random Reverse Sorted Array Sort
    int[] a3 = randReverse(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a3) + "\n");
    int[] a3check = Arrays.copyOf(a3, a3.length);
    Arrays.sort(a3check);
    Sorts.selectionSort(a3);
    checkCorrect(a3, a3check, "Random Reverse Sorted Array");
  }

  public static void insertionTest (int len) {
    System.out.println();
    System.out.println("Insertion Test:");


    // Random Array Sort
    int[] a1 = randArray(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a1) + "\n");
    int[] a1check = Arrays.copyOf(a1, a1.length);
    Arrays.sort(a1check);
    Sorts.insertionSort(a1);
    checkCorrect(a1, a1check, "Random Array Sort");

    // Random Sorted Array Sort
    int[] a2 = randSorted(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a2) + "\n");
    int[] a2check = Arrays.copyOf(a2, a2.length);
    Arrays.sort(a2check);
    Sorts.insertionSort(a2);
    checkCorrect(a2, a2check, "Random Sorted Array");

    // Random Reverse Sorted Array Sort
    int[] a3 = randReverse(len);
    // System.out.println("Original Array: \n" + Arrays.toString(a3) + "\n");
    int[] a3check = Arrays.copyOf(a3, a3.length);
    Arrays.sort(a3check);
    Sorts.insertionSort(a3);
    checkCorrect(a3, a3check, "Random Reverse Sorted Array");
  }
}
