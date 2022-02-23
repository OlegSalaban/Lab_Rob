import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 digit value > ");
        int value = scanner.nextInt();

        int sum = value % 10 + value / 10;
        System.out.println("Sum of digits: " + sum);

    }
}
