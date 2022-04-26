package test;
// 구구단 3단부터 8단까지   // 3의 배수만 "몇단입니다 출력하기"
public class test2 {
    public static void main(String[] args) {

        for (int dan = 3; dan < 10; dan++) {
            if (dan % 3 == 0) {
                System.out.println(dan + "단 입니다");
            }
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
            System.out.println();

        }
    }
}
