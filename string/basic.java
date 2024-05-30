package string;

public class basic {
    public static void main(String[] args) {
        // // creating string - there is two way to create string variable in java ,
        // string is an object
        // -string
        // // is immutable always
        // // 1. with new keyword like object
        // String name = new String("ankit");
        // System.out.println(name);
        // // 2. using normal way -by string literal method "ankit"
        // String fname = "ankit";
        // System.out.println(fname);
        //////////////////////////////////////////////
        // compare two string with == operator , compare only reference, not object
        // value - equals()
        String name1 = "pooja";
        String name2 = "pooja";
        String name3 = new String("pooja");

        // if (name1 == name2) {
        // System.out.println("both are same");
        // } //return true

        if (name1 == name3) {
            System.out.println("both are same");
        } else {
            System.out.println("both are not same");
        } // return false

    }
}
