public class StudentDetails {
    // class
    String name = "ankit";
    private int rol = 59;

    // getter function
    public int getRol() {
        return rol;
    }

    // // setter function
    // public void setRol(int rNum) {
    // rol = rNum;
    // }
    // setter function with this keyword
    public void setRol(int rol) {
        this.rol = rol;
    }

    // constructor
    public StudentDetails(String naam, int rn) {
        name = naam;
        rol = rn;
    }

}
