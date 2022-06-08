public class EX10_04 {
    public static void main(String[] args) {
        int a=100,b=0; //0으로 나눌 수 없다.
        int result;
        try{
            if(b==0)  // 조건을 만족하면 무조건 catch로 던지세요
                throw new Exception("0으로 나누려고요? 안됩니다."); //아래랑 동일해야지 던질 수 있음
            result =a/b;
        }catch (Exception e){
            System.out.println("발생 오류 : "+e.getMessage()); //exception 클래스 안에 getMessage 함수가 들어가 있는 것
            System.out.println("에러 메시지 : "+e );
        }
    }
}
