package arrays;

public class commonElementInteger {
    public static void main(String[] args) {
        int[] arr1 = { 4, 6, 3, 9, 1 };
        int[] arr2 = { 1, 5, 8, 9, 33 };
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.println("The common elements is : " + arr1[i]); // you could be print arr[j] also
                        // here.
                    }
                }
            }
        } else {
            System.out.println("Please provide array of same size");
        }

    }

}
