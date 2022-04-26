package test;

import java.util.Scanner;

// 1. 정수를 입력 받아 홀수 인지 짝수 인지 구분하세요
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();

        if(a%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수 입니다.");
        }

    }
}
