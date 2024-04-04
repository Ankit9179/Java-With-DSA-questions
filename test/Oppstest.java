// package test;

// public class Oppstest {
//     int x = 5;

//     public static void main(String[] args) {
//         Oppstest myObject = new Oppstest();
//         System.out.println(myObject.x);
//     }
// }
package test;

public class Oppstest {

    public static void main(String[] args) {
        int ans = 100000;
        int[] arr = { 9, 5, 6, 8, 4, 2 };
        for (int i = 0; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}