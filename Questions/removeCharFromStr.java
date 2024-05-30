//remove special character from string
package Questions;

public class removeCharFromStr {
    public static void main(String[] args) {

        String str1 = "ank$kkj&hju#y";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i); // i = value
            if (currentChar != '$' && currentChar != '&' && currentChar != '#') {
                result.append(currentChar);
            }
        }
        System.out.println(result);

    }

}
