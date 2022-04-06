import java.util.Scanner;

public class test06_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;

        //시작값이 끝보다 큰 수가 들어오면, "시작값이 끝 수보다 큽니다"
        //for문 실행 안되게...

        System.out.printf("시작값 입력: ");
        num1 = s.nextInt();

        System.out.printf("끝값 입력: ");
        num2 = s.nextInt();

        System.out.printf("증가값 입력: ");
        num3 = s.nextInt();

        if (num1 >= num2) {
            System.out.println("시작값이 끝 수보다 큽니다");
        } else {
            for (int i = num1; i <= num2; i += num3) {
                hap += i;
            }
            System.out.println(num1 + " ~ " + num2 + " 까지 " + num3 + " 씩 증가한 합은?   " + hap);
        }
    }
}
