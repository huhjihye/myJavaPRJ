package star;


import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = n / 2 + 1;
        int s = 0;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                s++;
            } else {
                s--;
            }
            for(int j=0;j< s ;j++ ){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }


