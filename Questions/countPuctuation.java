// count puctuation in given string 
package Questions;

public class countPuctuation {
    public static void main(String[] args) {
        String srt = "an;ki,t";
        for (int i = 0; i < srt.length(); i++) {
            if (srt.charAt(i) == ';' || srt.charAt(i) == ',' || srt.charAt(i) == '.' || srt.charAt(i) == '?') {
                System.out.println(srt.charAt(i));
            }
        }
    }
}