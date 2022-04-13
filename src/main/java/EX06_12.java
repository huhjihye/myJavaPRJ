import java.util.Scanner;

public class EX06_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int dan;

        System.out.printf("몇단?");
        dan=sc.nextInt();

        for(i=1;i<=9;i++){
            System.out.printf("%d X %d =%d\n", dan,i,dan*i);
        }
    }
}
