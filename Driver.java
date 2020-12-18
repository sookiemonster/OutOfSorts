import java.io.*;
import java.util.*;

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

  }

  public static void randArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int randNum =(int)(Math.random()*1000);
      arr[i] = randNum;
    }
  }

  public static void bubbleTest(int len) {
    int[] arr = new int[len];
    randArray(arr);
    System.out.println(Arrays.toString(arr));
    Sorts.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void selectionTest (int len) {
    int[] arr = new int[len];
    randArray(arr);
    System.out.println(Arrays.toString(arr));
    Sorts.selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
