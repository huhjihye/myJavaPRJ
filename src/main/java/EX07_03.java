import java.util.Scanner;

public class EX07_03 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a,b;

        while (true){
            System.out.printf("더할 첫 번째 수: ");
            a=s.nextInt();
            System.out.printf("더할 두번째 수: ");
            b=s.nextInt();

            System.out.println(a+"+"+b+"="+(a+b));
        }
    }
}
