public class EX09_09 {
    public static void main(String[] args) {
        String str1="Java Programming"; //str1 , str2는 같은 곳에 저장
        String str2="Java Programming";
        String str3=new String("Java Programming"); //강제로 메모리에 새로 올려준다.(new)

        System.out.println("원 문자열1==> ["+str1+"]");
        System.out.println("원 문자열2==> ["+str2+"]");
        System.out.println("원 문자열3==> ["+str3+"]\n");

        System.out.println("문자열1 ==문자열2 결과: \t" +(str1==str2));  // == 같은 메모리에 있는 값을 참조 하느냐 안하느냐 비교 할때 , str1, str2는 같은 메모리에 있어!
        System.out.println("문자열1.equals(문자열2) 결과:" +str1.equals(str2)); //String에서는 값 비교하고 싶을 때 ==사용하지 말고 equals 쓰자!
        System.out.println("문자열1 ==문자열3 결과: \t" +(str1==str3));
        System.out.println("문자열1.equals(문자열3) 결과: " +str1.equals(str3));

        System.out.println("문자열1과 문자열2가 다른지 비교 compareTO 안쓰고, 이렇게 함 : "+!str1.equals(str2));

    }
}
