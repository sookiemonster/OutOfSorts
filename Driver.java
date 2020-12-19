import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    int[] a = {2, 3, 6 , 4, 1, 0};
    Sorts.bubbleSort(a);
    System.out.println(Arrays.toString(a));

    int[] b = {1, 2, 3};
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));

    int[] c = {1, 1, 2, 4, 3, 3, 0, 0};
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));

    int[] d = {1, 2, 3, 4};
    Sorts.bubbleSort(d);
    System.out.println(Arrays.toString(d));

    int[] e = {7, 6, 5, 4};
    Sorts.bubbleSort(e);
    System.out.println(Arrays.toString(e));

    bubbleTest(10);
    bubbleTest(0);
    bubbleTest(1);
    bubbleTest(2);
    bubbleTest(20);

    // SELECTION SORT ------------------------------

    System.out.println();
    System.out.println("Selection Sort Test: \n");

    int[] ss = {2, 3, 6 , 4, 1, 0};
    System.out.println(Arrays.toString(ss));
    Sorts.selectionSort(ss);
    System.out.println(Arrays.toString(ss));
    Sorts.selectionSort(ss);
    System.out.println(Arrays.toString(ss));

    int[] sa = {7, 6, 5, 4, 3, 2};
    System.out.println(Arrays.toString(sa));
    Sorts.selectionSort(sa);
    System.out.println(Arrays.toString(sa));

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

  public static void bubbleTest(int len) {
    int[] a1 = randArray(len);
    System.out.println(Arrays.toString(a1));
    Sorts.bubbleSort(a1);
    System.out.println(Arrays.toString(a1));
  }

  public static void selectionTest (int len) {
    int[] a1 = randArray(len);
    System.out.println(Arrays.toString(a1));
    Sorts.selectionSort(a1);
    System.out.println(Arrays.toString(a1));
  }
}
