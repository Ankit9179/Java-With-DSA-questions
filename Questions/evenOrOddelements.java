package Questions;

public class evenOrOddelements {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int n = arr.length; // it will return 5
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp;
                temp = i + j / 2; // even or odd
                if (temp == 0) {
                    System.out.println(arr[i] + "+" + arr[j] + " = even");
                } else {
                    System.out.println(arr[i] + "+" + arr[j] + " = odd");
                }
            }
        }

    }
}
