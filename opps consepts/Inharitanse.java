import java.time.LocalDate;
import java.time.LocalTime;

public class Inharitanse {
    public static class InharitClass extends Calculater {

    }

    public static void main(String[] args) {
        InharitClass objj = new InharitClass();
        System.out.println(objj.sum(5, 6)); // single inharitance output -11
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }
}
