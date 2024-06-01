package Questions;

public class evenOrOddelements {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        int n = arr.length; // it will return 5
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum % 2 == 0) {
                    System.out.println(arr[i] + "+" + arr[j] + " = even");
                } else {
                    System.out.println(arr[i] + "+" + arr[j] + " = odd");
                }
            }
        }

    }
}
