//creating class  , class always start with class keyword and class name must be start capital letter {}.
class Myclass {
    // these are data members
    String name = "ram";
    // int salary = 25000;
    static int salary = 25000;
    int incentive = 400;

    // this is method
    void totalSalary() {
        System.out.println(salary + incentive);
    }
}

public class Classl {
    public static void main(String[] args) {
        //////// accessing with properties of class with the help of object
        // creating object with the help of Myclass class , creating a object first-
        // Classname objectname = new keyword className() like this.
        // Myclass myObject = new Myclass();
        // System.out.println(myObject.salary); // printing a variable of an object
        // myObject.totalSalary(); // calling a function of object

        //////// accessing with properties of class with the help of object
        System.out.println(Myclass.salary); // for this line you have to write static keyword befor salary
    }
}
