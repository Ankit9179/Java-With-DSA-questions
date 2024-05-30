package string;

import java.util.*;

public class question {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in); // new string created in memory
        System.out.print("enter your first name :");// new string created in memory
        String fname = sv.nextLine();// new string created in memory
        System.out.print("enter your last name :");// new string created in memory
        String lname = sv.nextLine();// new string created in memory

        System.out.println("Answer is : " + fname + " " + lname);// new string created in memory
        sv.close();
    }

}
