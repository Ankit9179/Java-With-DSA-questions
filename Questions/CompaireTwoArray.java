//Question - compaire two Array 
package Questions;

public class CompaireTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, };
        boolean flag = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = 0; j < arr2.length - 1; j++) {
                    if (arr1[i] != arr2[j]) {
                        flag = false;
                    } else {
                        flag = true;
                    }
                }
            }
        }
        if (flag == true) {
            System.out.println("array is equal");
        } else {
            System.out.println("array is not equal");
        }
    }
}
