// //taking input string from user
// import java.util.*;
// public class Input{
//     public static void main(String[] agrs){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.print(name);
//     }
// }

//taking input integer from user
// import java.util.*;
// public class Input{
//     public static void main(String[] agrs){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.print(num*num);
//     }
// }

// take input two variable from user and return sum 
import java.util.*;

public class Input {
    public static void main(String[] agrs) {
        // scanner class for taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number for a : ");
        int a = sc.nextInt();
        System.out.print("enter number for a : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("the sum of a and b is : " + sum);
        sc.close();
    }
}
