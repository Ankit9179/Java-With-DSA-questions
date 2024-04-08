public class Student {

    // class
    public static class StudentObj {
        String name = "ankit";
        int rolNum = 59;
    }

    // getter function
    public static void printfunc(int x) {
        System.out.println(x);
        return;
    }

    public static void main(String[] args) {
        // object
        StudentObj obj = new StudentObj();
        System.out.println(obj.name);
        int val = obj.rolNum;
        // function call
        printfunc(val);
    }
}