public class EX06_13 {
    public static void main(String[] args) {
        int i,k;
              // 총 실행 횟수: 3*2 =6번
        for(i=0;i<3;i++){    //3번 반복
            for(k=0;k<2;k++){  //2번 반복
                System.out.printf("중첩 for문입니다. (i값:%d, k값: %d)\n", i,k);
            }
        }
    }
}
