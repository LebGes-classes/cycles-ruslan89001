import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер подзадачи:");
        int num = scan.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("Такой подзадачи нет");
            System.exit(0);
        }
        System.out.println("Введите значение аргумента x");
        double x = scan.nextDouble();
        System.out.println("Введите значение аргумента a");
        double a = scan.nextDouble();
        System.out.println("Введите значение аргумента b");
        double b = scan.nextDouble();
        if (num == 1) {
            y = Math.pow(a + b, 0.5) < x ? a * Math.pow(x, 2) + b * Math.log10(Math.abs(2 * x)) : Math.pow(a + Math.sin(2 * x), 0.5);
        } else if (num == 2) {
            y =3 * a > b ? Math.log(Math.pow(x, 2)) - Math.exp(x / 3) : Math.atan(2 * x - 0.6);
        } else if (num == 3) {
            y = 3 * Math.pow(b, 2) > a ? Math.exp(Math.sin(x)) + b : Math.exp(-x) + a * Math.log10(x);
        }
        else if (num == 4) {
            y = Math.abs(Math.pow(a, 2) - Math.pow(b, 2)) > b ? Math.pow(a, x / 2) - Math.exp(Math.cos(x)) : Math.tan(4 * x) - a;
        }
        else if (num == 5) {
            y = Math.abs(a - Math.pow(b, 2)) > b ? Math.log(a * x - b) - Math.exp(Math.tan(x)) : Math.tan(4 * x) - a;
        }
        else if (num == 6) {
            y = Math.abs(3 * a - b) > 0 ? 2 * Math.log(x) - Math.exp((a * x - b) / 10) : Math.asin(x / 10);
        }
        else if (num == 7) {
            y = a * x < b ? Math.exp(-2 * x) + Math.pow(Math.pow(a, 4) + x, 4) : Math.sin(x) - Math.pow(b, 2);
        }
        else if (num == 8) {
            y = a * b < 2 * x ? b * Math.exp(-3 * x) + Math.pow(Math.sin(a), 2) : Math.pow(x, 3) / a  - x / b;
        }
        else if (num == 9) {
            y = Math.pow(a + 3 * b, 0.5) < 3 * x ?  a * Math.pow(x, 2) + Math.tan(4 * x) : Math.pow(a + Math.abs(Math.sin(3* x)), 0.5);
        }
        else {
            y = 3 * a> 2 * b ? Math.log(Math.pow(x, 2)) - Math.asin(x / 10) : Math.atan(2 * x - 0.6) + 2 * Math.log(x);
        }
        System.out.println(y);
    }
}

