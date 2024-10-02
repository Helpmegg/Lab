import java.util.Scanner;

public class Task3 {


    public static double calculateInfiniteSum(double epsilon) {
        double sum = 0.0;
        double term;
        int i = 1;

        do {
            term = Math.pow(-1, i + 1) / (i * (i + 1) * (i + 2));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon); // Продовжувати, поки |term| >= ε

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть точність ε (> 0): ");
        double epsilon = scanner.nextDouble();

        // Перевірка на правильність введення ε
        if (epsilon <= 0) {
            System.out.println("Точність ε повинна бути більше 0.");
            return;
        }

        // Обчислення нескінченної суми
        double result = calculateInfiniteSum(epsilon);

        // Виведення результату
        System.out.println("Сума ряду з точністю " + epsilon + " = " + result);

        scanner.close();
    }
}
