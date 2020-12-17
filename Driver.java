import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args) {
    int[] a = {2, 3, 6 , 4, 1, 0};
    Sorts.bubbleSort(a);
    System.out.println(Arrays.toString(a));
    Sorts.bubbleSort(a);
  }
}
