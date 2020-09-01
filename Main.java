class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

  /**
   * Sort an array of TestIntegers using the quicksort algorithm.
   *
   * (This function sorts a sub-range of the array from p up to and including r.)
   */
  public static void quicksort(TestInteger[] array, int p, int r) {

  }

  /**
   * For the sub-range of the arary from indices p to r inclusive:
   *
   * Break the range into three groups: a pivot element, all the elements less
   * than the pivot, and all of the elements greater than the pivot. Reorder the
   * range so that the smaller elements come first, then the pivot, then the
   * bigger elements.
   *
   * Return the new index of the pivot element.
   */
  public static int partition(TestInteger[] array, int p, int r) {
    TestInteger pivot = array[r]

    int i = p-1
    int j;
    for(j = p; j <= r-1; j++){
      if(array[j].compareTo(pivot) <= 0){
        i = i+1;
        TestInteger temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
      temp = array[i+1];
      array[i+1]=array[r];
      array[r]=temp;
    }
    return i+1;
  }

  /**
   * Takes a TestInteger[] and returns true if sorted and false if not.
   */
  public static boolean isSorted(TestInteger[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i].compareTo(array[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }
}
