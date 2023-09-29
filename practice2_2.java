public class practice2_2 {
    public static void main(String[] args) {
        // т.к. дз делал давно, то делал 1 вариант
        for (int i = 10; i<100; i++){
            int i1 = i * 2;
            String str = Integer.toString(i);
            int s = i % 10 + i / 10;
            int s1 = i1 % 10 + i1 / 10;
            if (s == s1){
                System.out.println(i);
            }
        }
    }
}
