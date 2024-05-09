//second largest element in the array
package arrays;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 99, 3, 2222, 55, 66, 7 };
        int largest = arr[0]; // 2
        int secondLargest = arr[1]; // 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest || secondLargest > largest) {
                // here i'm using swapping value from largest to second largest variable
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
