import java.util.Scanner;

public class MyFirstCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int firstNumber;
        int secondNumber;
        int sum;
        firstNumber = scanner.nextInt();
        System.out.println("enter the second number : ");
        secondNumber = scanner.nextShort();
        sum = firstNumber + secondNumber;
        System.out.println("the sum is: " + sum );
    }
}