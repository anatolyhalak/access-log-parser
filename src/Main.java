import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = (int) firstNumber + secondNumber;
        System.out.println("Сумма чисел: " + sum);

        int difference = (int) firstNumber - secondNumber;
        System.out.println("Разность чисел: " + difference);

        int productOfNumbers = (int) firstNumber * secondNumber;
        System.out.println("Произведение чисел: " + productOfNumbers);

        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное чисел: " + quotient);
    }
}
