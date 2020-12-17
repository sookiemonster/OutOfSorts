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
    int maxLength = data.length;
    int swapCount;
    while (maxLength > 0) {
      swapCount = 0;
      for (int i = 0; i < maxLength; i++) {
        if (swap(data, i)) {
          swapCount++;
        }
      }
      if (swapCount == 0) {
        maxLength = 0;
      }
      maxLength--;
    }
  }
}
