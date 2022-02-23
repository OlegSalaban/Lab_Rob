import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input double value > ");
        double value = scanner.nextDouble();

        System.out.println("Result: " + Math.round(value));
    }
}
