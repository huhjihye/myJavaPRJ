public class test06_01 {  //5! 구하기 (5*4*3*2*1)
    public static void main(String[] args) {
        int i;
        int f= 1;

        for (i = 5; i > 0; i--) {
            f *= i;
        }
        System.out.println(f);
    }
}
