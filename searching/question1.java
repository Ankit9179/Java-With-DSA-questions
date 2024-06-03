package searching;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int[] arr = { 2, 33, 44, 55, 6, 8, 9 };
        System.out.print("Enter a target number :- ");
        int target = cs.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("index of the target is :- " + i);
                flag = false;
                break; // it is needed
            } else {
                flag = true;
            }

        }
        if (flag == true) {
            System.out.println("Element is not present ");
        }

        cs.close();
    }
}
