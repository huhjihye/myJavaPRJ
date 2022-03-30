import java.util.Scanner;

public class TermTest_2 {
    public static void main(String[] args) {

        // 내가 입력한 숫자가 3의 배수인지? 5의 배수인지? 3과 5의 배수인지?
        // 순서 잘 확인하기 --> 범위가 제일 큰게 제일 먼저 들어가기

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if (a % 15 == 0) { // if((a % 3 ==0) && (a % 5 ==0)) ==> 3 번의 연산수행한다.
            System.out.println("3과 5의 배수를 둘다 만족합니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }


    }
}
