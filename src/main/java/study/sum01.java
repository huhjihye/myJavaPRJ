package study;

public class sum01 {
    public static void main(String[]args){
        int i=1,j=5;
        int k=sum(i,j);
        System.out.println("k :"+ k );

        int m=sum(10,11);
        System.out.println("m :"+m);
    }
    public static int sum(int i1, int i2){ //static이 있어야 메모리에 올라가고 불러다 쓸 수 있다.
        int sum=0;
        for(int i=i1; i<i2;i++){
            sum+=1;
        }
        return sum;
    }
}




