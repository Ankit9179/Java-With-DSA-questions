//linear search - searching element is 6,

package searching;

public class leanerSearch {
    public static void main(String[] args) {
        int[] values = { 12, 3, 44, 5, 6, 88 };
        int num = 6;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == num) {
                System.out.println("index is " + i + " of value " + num);
                break; // is necessary
            } else {
                System.out.println("element not present");
                break;
            }
        }

    }
}
