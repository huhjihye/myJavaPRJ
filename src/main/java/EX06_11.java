import java.util.Scanner;

public class EX06_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;

        System.out.printf("시작값 입력: ");
        num1 = s.nextInt();

        System.out.printf("끝값 입력: ");
        num2 = s.nextInt();

        System.out.printf("증가값 입력: ");
        num3 = s.nextInt();

        for (int i = num1; i <= num2; i += num3) {
            hap += i;
        }
        System.out.println(num1 + " ~ " + num2 + " 까지 " + num3 + " 씩 증가한 합은?   " + hap);
    }
}
