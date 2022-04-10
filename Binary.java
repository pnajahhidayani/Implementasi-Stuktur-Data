package search;

    class BinarySearch {
        int binarySearch(int array[], int x, int low, int high) {
      
          // perulangan sampe yg terkecil dan yg tebesar ketemu
          while (low <= high) {
            //middle nya terkecil + (terbesar - terkecil) dibagi 2
            int mid = low + (high - low) / 2;

            //klo dia mid, return midnya
            if (array[mid] == x)
              return mid;
            
            //klo dia lebih besar, yg terkecil = mid + 1
            if (array[mid] < x)
              low = mid + 1;
            
            //selain itu mid - 1
            else
              high = mid - 1;
          }
      
          return -1;
        }
      
        public static void main(String args[]) {
          BinarySearch ob = new BinarySearch();
          int array[] = { 4, 7, 10, 8, 9, 30, 33, 100 };
          int n = array.length; //sesuai panjang array
          int x = 33;
          int result = ob.binarySearch(array, x, 0, n - 1);
          if (result == -1)
            System.out.println("Not found");
          else
            System.out.println("Angka ditemukan pada index ke " + result);
    }
}
