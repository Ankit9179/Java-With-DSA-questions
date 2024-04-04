import java.util.*;

public class ReverseString {
    // function
    static String Myfunc(String srt) {
        int i;
        String rev = " ";
        for (i = srt.length() - 1; i >= 0; i--) {
            rev = rev + srt.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string for reverse :- ");
        String myStr = sc.nextLine();
        sc.close();
        System.out.println("the reverse of string is :- " + Myfunc(myStr));
    }
}
