import java.util.Scanner;

public class practice3_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы (n*n)");
        int n = scan.nextInt();
        int matrix[][] = new int[n][n];
        int a;
        boolean flag = true;
        System.out.println("Введите элементы матрицы");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[j][i] = scan.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            flag = true;
            for (int j=0;j<n;j++){
                if (matrix[j][i] % 2 != 0){
                    flag = false;
                }
            }
            if (flag){
                a = i+1;
                System.out.println(a + " - чётная строка");
            }
        }
        if (n < 3){
            for (int i=0;i<n;i++) {
                for (int j=0; j<n;j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("В матрице меньше 3 строк");
        }
        else {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][2] + " ");
            }
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][1] + " ");
            }
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][0] + " ");
            }
            System.out.print("\n");
            for (int i = 3; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
