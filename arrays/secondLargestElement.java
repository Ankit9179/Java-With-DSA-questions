//second largest element in the array
package arrays;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 55, 3, 4, 5, 6, 7, 8 };
        int largest = arr[0]; // 2
        int secondLargest = arr[1];// 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest || largest > secondLargest) {
                // here i'm using swapping value concept
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
