import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scan.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println("Год обезьяны");
                break;
            case 1:
                System.out.println("Год петуха");
                break;
            case 2:
                System.out.println("Год собаки");
                break;
            case 3:
                System.out.println("Год свиньи");
                break;
            case 4:
                System.out.println("Год крысы");
                break;
            case 5:
                System.out.println("Год коровы");
                break;
            case 6:
                System.out.println("Год тигра");
                break;
            case 7:
                System.out.println("Год зайца");
                break;
            case 8:
                System.out.println("Год дракона");
                break;
            case 9:
                System.out.println("Год змеи");
                break;
            case 10:
                System.out.println("Год лошади");
                break;
            case 11:
                System.out.println("Год овцы");
                break;
        }
    }
}

