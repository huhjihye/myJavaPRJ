public class EX09_08 {
    public static void main(String[] args) {
        String str1= "Java Programming";
        String str2= "Java IT CookBook";

        System.out.println("원 문자열1==> [" +str1 +"]");
        System.out.println("원 문자열2==> [" +str2 +"]");

        System.out.println(str1.compareTo(str2)); // str1 이랑 str2 값이 비교할때.  (잘 사용안함)
        System.out.println(str1.contains("Java")); //true false랑 비교
        System.out.println(str1.indexOf("Java")); //contains랑 indexOf 랑 유사하다. // 위치
        System.out.println(str1.indexOf("Java")>-1); // 0보다 크다 라는게 존재한다.


    }
}
