public class EX09_01 {
    public static void main(String[] args) {
        String str="IT CookBook. Java";
        int len;

        len = str.length();

        System.out.printf("문자열 :  %s \n" ,str);
        System.out.printf("문자열 길이 :  %d\n" ,len);

        if(str.length()>0) {
            System.out.println("str 변수에 값이 존재한다. ");
        }else{
            System.out.println("str 변수에 값이 존재안한다. ");
        } //응용 : 값을 가지고 왔을 때, 값이 있는지 없는지 체크 할때  str변수에 값이 존재하는지 아닌지 찾고 싶을 때 )

    }
}
