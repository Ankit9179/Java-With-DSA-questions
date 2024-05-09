// write a code for reverse array element 
package arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 55, 33, 90 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
