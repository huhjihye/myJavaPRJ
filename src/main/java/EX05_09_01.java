import java.util.Scanner;

public class EX05_09_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int a = s.nextInt();

        if (a == 1) {
            System.out.println("1을 선택했다");
        } else if (a == 2) {
            System.out.println("2를 선택했다");
        } else if (a == 3) {
            System.out.println("3을 선택했다");
        } else if (a == 4) {
            System.out.println("4를 선택했다");
        } else {
            System.out.println("이상한 걸 선택했다");
        }
    }
}
