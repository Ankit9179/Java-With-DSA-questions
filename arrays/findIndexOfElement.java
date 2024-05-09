package arrays;

import java.util.*;

public class findIndexOfElement {
    public static void main(String[] args) {
        int[] arr = { 99, 88, 77, 66, 55 };
        Scanner sc = new Scanner(System.in);
        System.out.println("array - [99, 88, 77, 66, 55]");
        System.out.print("Enter a element whose you want to know index of that element : ");
        int searchEl = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (searchEl == arr[i]) {
                System.out.println("The index of " + searchEl + " element is : " + i);
            }
        }

        sc.close();

    }
}
