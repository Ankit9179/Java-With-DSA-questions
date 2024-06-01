package Questions;

import java.util.Scanner;

public class someOffirstandlastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int lastdigit = num % 10;

        int firstdigit = num;
        while (firstdigit > 10) {
            firstdigit = firstdigit / 10;
        }

        System.out.println("Sum of first and last digit: " + (firstdigit + lastdigit));

        sc.close();

    }

}
