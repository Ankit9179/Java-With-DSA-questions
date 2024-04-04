//Q . sum two number with class and object

//import packages
import java.util.*;

class Calculater {
    public int sum(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class SumNum {
    public static void main(String[] args) {
        // creationg bc object with Scanner class for taking input from user
        Scanner bc = new Scanner(System.in);
        System.out.print("enter a number1 :- ");
        int x = bc.nextInt();
        System.out.print("enter a number2 :- ");
        int y = bc.nextInt();
        bc.close();

        // creating object
        Calculater cal = new Calculater();

        // call method of class with the help of object
        int result = cal.sum(x, y); // calling sum func with some refrence value and reaceiving value in a result
                                    // variable
        System.out.println("answer is - : " + result);
    }
}
