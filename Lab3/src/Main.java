public class Main {
    private double m;
    private int k;

    // Конструктор класу
    public Main(double m, int k) {
        this.m = m;
        this.k = k <= 30 ? k : 30; // Перевірка, щоб k не перевищував 30
    }

    // Метод для обчислення суми ряду
    public double calculateSum() {
        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            double term = Math.sqrt(m * (1.0 / i)) * Math.sin(m * i);
            sum += term;
        }
        return sum;
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        double m = 2.0;
        int k = 30;

        // Створення об'єкту класу
        Main seriesSum = new Main(m, k);

        // Обчислення та виведення суми
        double result = seriesSum.calculateSum();
        System.out.println("Сума ряду: " + result);
    }
}
