//find the maximum and minimum elements of an array 
package arrays;

public class maximumAndminimum {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 8, 1, 9 };

        int max = arr[0]; // 4
        int min = arr[0]; // 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum value is :" + max);
        System.out.println("minimum value is :" + min);
    }
}
