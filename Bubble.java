package sorting;

import java.util.Arrays;

class Main {
    static void bubbleSort(int array[]) {
        int size = array.length;
        
        for (int i = 0; i < size - 1; i++)

          for (int j = 0; j < size - i - 1; j++)

            if (array[j] > array[j + 1]) {

              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;
            }
      }
    
      public static void main(String args[]) {
          
        int[] data = { 6, 22, 2, 10, 8, 7, 100, 1, 3, 5 };
        
        // buat manggil method di class
        Main.bubbleSort(data);
        
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
      }
    }
