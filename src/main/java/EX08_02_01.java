import java.util.Scanner;

public class EX08_02_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []aa=new int[4]; //같은 유형끼리
        int hap;


        for(int i=0; i<4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요", i + 1);
            aa[i] = sc.nextInt();
        }

        hap=aa[0]+aa[1]+aa[2]+aa[3];

        System.out.println("합계 : "+hap);


        }
    }
