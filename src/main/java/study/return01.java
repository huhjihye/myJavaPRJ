package study;

public class return01 {
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[]args){
        int a=3;
        int b=4;
        return01 myreturn01 =new return01();
        int c = myreturn01.sum(a,b);

        System.out.println(c);
    }
}
