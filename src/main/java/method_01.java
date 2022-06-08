public class method_01 {
    public static void main(String[] args) {
        sum01 sum001 = new sum01();

        System.out.println(sum001.str);
        System.out.println(sum001.sum(1, 2));


    }
}
    class sum01{  //메모리를 통으로 올림 , 변수나 함수나 다 같이 메모리에 올라감
    String str="허지혜";

        public int sum(int num1, int num2){
            return num1+num2;
        }
    }

