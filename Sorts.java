public class Sorts {


  private static boolean swap(int[] data, int x) {
    if (x+1 < data.length && data[x] > data[x+1]) {
      int temp = data[x];
      data[x] = data[x+1];
      data[x+1] = temp;
      return true;
    }
    return false;
  }

  public static void bubbleSort(int[] data) {
    boolean swapped = false;
    while (swapped) {
      swapped = false;
      int maxLength = data.length;
      for (int i = 0; i < maxLength; i++) {
        if (swap(data, i)) {
          swapped = true;
        }
      }
      maxLength--;
    }
  }
}
