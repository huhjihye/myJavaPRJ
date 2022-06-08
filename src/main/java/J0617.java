import java.util.Scanner;

public class J0617 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int x = n;
        int count = 0;
        while(true) {
            int ten = x % 10;
            int one = ((x / 10) + ten) % 10;

            x = (ten * 10) + one;
            count++;
            if (n == x) {
                break;
            }
        }
        System.out.println(count);
    }
}
