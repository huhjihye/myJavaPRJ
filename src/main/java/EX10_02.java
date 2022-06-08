public class EX10_02 {
    public static void main(String[] args) {
        int[]aa=new int[3];
        try{
            aa[2]=100/0; //0으로 못나눔 / 바로 catch로 가기 때문에 아래 오류는 실행 멈춰버림
            aa[3]=100; //동작 안함 . 위에서 에러났기 때문에 실행 자제가 안됨
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("에러 메시지 : "+e);
        }catch(ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요 ~ ");
            System.out.println("에러 메시지 : "+e);
        }catch (Exception e){ // 무조건 맨 아래에 작성 해야함 catch는 순서대로 가기 때문에..
            System.out.println("난 모든 에러를 다 잡아요 ");
            System.out.println("에러 메시지 : "+ e);
        }finally {//에러가 나든 안나든 finally 무조건 실행됨 / DB 연동할때는 무조건 있어야함 / 필수는 아니지만 무조건 써주는게 좋음
            System.out.println("이 부분은 무조건 나와요 ~~");
        }
    }
}
