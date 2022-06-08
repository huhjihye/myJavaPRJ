public class EX10_01 {
    public static void main(String[] args) {
        int[]aa=new int[3];
        try{
            aa[3]=100; //aa[0], aa[1], aa[2] 까지만 작성 가능
        }catch (ArrayIndexOutOfBoundsException e){ //e 라는건 다른 문자로도 대체 가능 , 보통 Exception 약자 e 많이 사용함
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~"); //에러 메세지
            System.out.println("에러 메세지 : " +e); //에러 원인 잡기 위해서 출력
        }
    }
}
