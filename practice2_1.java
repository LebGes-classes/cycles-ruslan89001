import java.util.Scanner;

public class practice2_1 {
    public static void main(String[] args) {
        // т.к. дз делал давно, то делал 1 вариант
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double xk = scan.nextDouble();
        double sh = scan.nextDouble();
        double y;
        System.out.println("Значение аргумента   Значение функции");
        while (x < xk) {
            if (x >= -9 && x<-6){
                y = -(Math.pow(-(x*x) - 12 * x - 27, 0.5));
            }
            else if (x>=-6 && x<=-3){
                y = x + 3;
            }
            else if (x>-3 && x<=0){
                y = Math.pow(-(x*x)+9,0.5);
            }
            else if (x>0 && x<=3){
                y = -(x) + 3;
            }
            else{
                y = 0.5*(x - 3);
            }
            System.out.println(x+"                      "+y);
            x+=sh;
        }
    }
}
