public class GetterAndSetter {
    public static void main(String[] args) {
        // // objj
        // StudentDetails obj = new StudentDetails();
        // System.out.println(obj.getRol()); // it will print 59

        // // set value in this variable
        // obj.setRol(12); // set 12
        // System.out.println(obj.getRol()); // it will print 12 - changed value

        // new object with construnctor
        StudentDetails obj = new StudentDetails("amiii", 55);
        System.out.println(obj.name);
        System.out.println(obj.getRol());
        System.out.println(obj.numberOfStudent);
        StudentDetails obj1 = new StudentDetails("ram", 55); // testing static keyword
        System.out.println(obj1.numberOfStudent); // testing static keyword
    }
}
