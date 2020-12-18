public class Sorts {


  private static boolean bubbleSwap(int[] data, int x) {
    if (x+1 < data.length && data[x] > data[x+1]) {
      int temp = data[x];
      data[x] = data[x+1];
      data[x+1] = temp;
      return true;
    }
    return false;
  }

  public static void bubbleSort(int[] data) {
    int maxLength = data.length;
    int swapCount;
    while (maxLength > 0) {
      swapCount = 0;
      for (int i = 0; i < maxLength; i++) {
        if (bubbleSwap(data, i)) {
          swapCount++;
        }
      }
      if (swapCount == 0) {
        maxLength = 0;
      }
      maxLength--;
    }
  }

  public static void swap(int[] data, int x, int y) {
    int temp = data[x];
    data[x] = data[y];
    data[y] = temp;
  }

  public static void selectionSort(int[] data) {
    int minIndex = 0;
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[minIndex]) {
          minIndex = j;
        }
      }
      swap(data, minIndex, i);
    }
  }
}
