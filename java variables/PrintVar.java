public class PrintVar {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int num = 55;
        int result = a + b + num;
        int multiplication = a * b * num;
        System.out.print(result);
        System.out.print(multiplication);
        // question aXb/a-b
        int qans = a * b / -a - b;
        System.out.print("answer is :" + qans);

    }
}