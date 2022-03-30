public class EX04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        a++;

        b = a++;  //b=a를 수행한 다음 a를 1증가시킨다.
        System.out.printf("%d\n", b);

        b = ++a;  // a를 1 증가시킨 다음 b=a를 수행한다.
        System.out.printf("%d\n", b);
    }
}
