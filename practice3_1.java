import java.util.Scanner;
import java.lang.Math;

public class practice3_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        int n = scan.nextInt();
        int m = 0;
        int res = 0;
        int sum = 0;
        boolean f = false;
        int arr[] = new int[n];
        System.out.println("Введите элементы массива");
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            if (Math.abs(arr[i]) > m){
                res = arr[i];
                m = Math.abs(arr[i]);
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i] < 0){
                f = true;
                continue;
            }
            if (arr[i] < 0){
                break;
            }
            if (f){
                sum += arr[i];
            }
        }
        System.out.println(res);
        System.out.println(sum);
    }
}
