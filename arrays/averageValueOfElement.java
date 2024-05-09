//note - array.length gives us number of elements in the array
package arrays;

public class averageValueOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 8 };
        int total = arr[0]; // 1
        int i = arr.length - 1; // i = 5th element
        while (i >= 1) {
            total = total + arr[i];
            i--;
        }
        float result = total / arr.length;
        System.out.println(result);
    }
}
