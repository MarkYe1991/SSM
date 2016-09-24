

public class BinarySearchTest {
   public static void main(String[] args) {
       int[] arr = new int[] { 12, 90 };
       System.out.println(search(arr, 12));
       System.out.println(search(arr, 90));
       System.out.println(search(arr, 67));
       System.out.println(search(arr, 89));
       System.out.println(search(arr, 99));
   }

   public static int search(int[] arr, int key) {
       int start = 0;
       int end = arr.length - 1;
       while (start <= end) {
           int middle = (start + end) / 2;
           if (key < arr[middle]) {
               end = middle - 1;
           } else if (key > arr[middle]) {
               start = middle + 1;
           } else {
               return middle;
           }
       }
       return -1;
   }
}