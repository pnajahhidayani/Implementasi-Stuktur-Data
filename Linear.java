package search;

class LinearSearch {
    public static int linearSearch(int array[], int x) {
        int n = array.length;
      
        // Going through array sequencially
        for (int i = 0; i < n; i++) {
          if (array[i] == x)
          return i;
        }
        return -1;
        }
      
        public static void main(String args[]) {
        int array[] = { 30, 4, 7, 10, 8, 100, 33 };
        int x = 9;
      
        int result = linearSearch(array, x);
      
        if (result == -1)
          System.out.print("Element not found");
        else
          System.out.print("Element found at index: " + result);
    }
}
