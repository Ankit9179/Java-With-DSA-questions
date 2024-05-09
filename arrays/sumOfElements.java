package arrays;

public class sumOfElements {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 32, 4, 55 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("the sum of an array's elements :" + sum);
    }
}
