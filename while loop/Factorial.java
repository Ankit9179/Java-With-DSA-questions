import java.util.*;

public class Factorial {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number for factorial : ");
        int n = sc.nextInt();
        int result = 1;
        while (n > 0) {
            result = result * n;
            n--;
        }
        sc.close();
        System.out.print("your answer is : " + result);

    }
}