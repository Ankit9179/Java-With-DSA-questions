//Q . find the vowels inside the a string
public class FindVowels {
    public static void main(String[] args) {
        String str = "kjaekujroi";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // System.out.println("the ans is : " + str.charAt(i));
                res = res + str.charAt(i);
            }
        }
        System.out.println(res);
    }
}