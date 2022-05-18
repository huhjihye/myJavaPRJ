public class EX09_06 {
    public static void main(String[] args) {
        String str="  한글  ABCD  efgh  ";

        System.out.println("원 문자열 ==> [" +str + "]");
        System.out.println("대문자로 ==> [" +str.toUpperCase( ) + "]");
        System.out.println("소문자로 ==> [" +str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" +str.trim() + "]");  //엎, 뒤 공백이 제거 되는 거 == trim
        System.out.println("전체공백제거 ==> ["+str.replaceAll( " ", "")+"]"); //ALL이 니까 전제 다 적용된다고 생각하기 , 공백을 ""으로 변환 시키기

    }
}
