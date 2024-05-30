//Question - compaire two Array 
package Questions;

import java.util.Scanner;

public class CompaireTwoArray {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int x = cs.nextInt();

        int count = 0;
        for (int num = 4; num >= 0; num--) {
            if (x >= 10) {
                count = count + 1;
                x = cs.nextInt();
            }
        }
        System.out.println(count);
        cs.close();
    }
}
