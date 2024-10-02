public class Task {
    private double m;
    private int k;


    public Task(double m, int k) {
        this.m = m;
        this.k = k <= 30 ? k : 30;
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
        Task seriesSum = new Task(m, k);


        double result = seriesSum.calculateSum();
        System.out.println("Сума ряду: " + result);
    }
}
