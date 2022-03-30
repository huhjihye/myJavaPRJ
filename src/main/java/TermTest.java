import java.util.Scanner;

public class TermTest {
    public static void main(String[] args) {

        //Q1. 내가 입력한 숫자가 홀인지 짝인지? 출력해주는 프로그램
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }

    }
}
