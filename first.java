import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        double z1 = 0;
        double z2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер подзадачи:");
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a);
            z2 = 0.25 - 0.25 * Math.sin(2.5 * Math.PI - 8 * a);
        } else if (num == 2) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a);
            z2 = 2 * Math.pow(2, 0.5) * Math.cos(a) * Math.sin(Math.PI / 4 + 2 * a);
        } else if (num == 3) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = (Math.sin(2 * a) + Math.sin(5 * a) - Math.sin(3 * a)) / (Math.cos(a) + 1 - 2 * Math.pow(Math.sin(2 * a), 2));
            z2 = 2 * Math.sin(a);
        }
        else if (num == 4) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = (Math.sin(2 * a) + Math.sin(5 * a) - Math.sin(3 * a)) / (Math.cos(a) - Math.cos(3 * a) + Math.cos(5 * a));
            z2 = Math.tan(3 * a);
        }
        else if (num == 5) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = 1 - 0.25 * Math.pow(Math.sin(2 * a), 2) + Math.cos(2 * a);
            z2 = Math.pow(Math.cos(a), 2) + Math.pow(Math.cos(a), 4);
        }
        else if (num == 6) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = Math.cos(a) + Math.cos(2 * a) + Math.cos(6 * a) + Math.cos(7 * a);
            z2 = 4 * Math.cos(a / 2) * Math.cos(2.5 * a) * Math.cos(4 * a);
        }
        else if (num == 7) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = Math.pow(Math.cos(0.375 * Math.PI - a / 4), 2) - Math.pow(1.375 * Math.PI + a / 4, 2);
            z2 = Math.pow(2, 0.5) / 2 * Math.sin(a / 2);
        }
        else if (num == 8) {
            System.out.println("Введите значение аргумента x");
            double x = scan.nextDouble();
            System.out.println("Введите значение аргумента y");
            double y = scan.nextDouble();
            z1 = Math.pow(Math.cos(x), 4) + Math.pow(Math.sin(y), 2) + 0.25 * Math.pow(Math.sin(2 * x), 2) - 1;
            z2 = Math.sin(y + x) * Math.sin(y - x);
        }
        else if (num == 9) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            System.out.println("Введите значение аргумента b");
            double b = scan.nextDouble();
            z1 = Math.pow((Math.cos(a) - Math.cos(b)), 2) - Math.pow((Math.sin(a) - Math.sin(b)), 2);
            z2 = -4 * Math.pow((Math.sin((a-b)/2)), 2) * Math.cos(a + b);
        }
        else if (num == 10) {
            System.out.println("Введите значение аргумента a");
            double a = scan.nextDouble();
            z1 = (Math.sin(Math.PI / 2 + 3 * a)) / (1 - Math.sin(3*a - Math.PI));
            z2 = 1 / Math.tan(1.25 * Math.PI + 1.5 * a);
        }
        else {
            System.out.println("Такой подзадачи нет");
            System.exit(0);
        }
        String res1 = String.format("%.3f", z1);
        String res2 = String.format("%.3f", z2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
