package arrays;

import java.util.Scanner; //here we could be used instead *

public class printing_ {
    public static void main(String[] args) {
        Scanner scObject = new Scanner(System.in);
        System.out.print("enter number of row : ");
        int numberOfRow = scObject.nextInt();
        System.out.print("enter number of column : ");
        int numberOfColumn = scObject.nextInt();

        for (int i = 1; i <= numberOfRow; i++) {
            for (int j = 1; j <= numberOfColumn; j++) {
                System.out.print(" _ "); // it's used for printing (_)
            }
            System.out.println(); // used for change row
        }
        scObject.close();
    }
}
