public class EX09_10_01 {
    public static void main(String[] args) { //static을 붙여야지만 메모리에 올릴 수 있다.)
        int i=1, j=10;

        int k=sum(i,j); //아래 15번째 줄하고 개숫가 같아야 한다.
        System.out.println("k : " +k);

        int m=sum(10,11);
        System.out.println("m : " +m);
    }

    public static int sum(int i1, int i2){ //함수를 새로 만듬 (메소드 새로 만듬 ) 클래스 안에 존재// int 타입이여야 한다.
        int sum=0;

        for(int i=i1; i<i2; i++){
            sum+=1;
        }
        return sum;
    }

}
