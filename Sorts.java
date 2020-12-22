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
      minIndex = data.length - 1;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[minIndex]) {
          minIndex = j;
        }
      }
      if (data[i] > data[minIndex]) {
        swap(data, minIndex, i);
      }
    }
  }

  // public static void swapUp(int[] arr, int element, int elementIndex) {
  //   if (element < arr[elementIndex-1]) {
  //     for (int j = elementIndex - 1; j >= 0; j--) {
  //       if (element < arr[j] && j > 0) {
  //         arr[j] = arr[j-1];
  //       } else if (j == 0) {
  //         arr[0] = element;
  //       } else {
  //         arr[j] = element;
  //         j = -1;
  //       }
  //     }
  //   }
  // }

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int element = data[i];
      if (element < data[i-1]) {
        for (int j = i - 1; j >=0; j--) {
          data[j+1] = data[j];
          if (j==0) {
            data[0] = element;
            break;
          } else if (data[j] >= element && data[j-1] <= element) {
            data[j] = element;
            break;
          }
        }
      }
    }
  }
}
