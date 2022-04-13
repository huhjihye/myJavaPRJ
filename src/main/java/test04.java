public class test04 {

    //1부터 100까지 숫자 중 3의 배수 또는 5의 배수에 만족하는 숫자만 덧셈을 하도록 반복문과 조건적을 이용해서 소스를 작성하시오
    public static void main(String[] args) {
        int hap=0;

        for(int i=0; i<101; i++){
            if ((i%3==0)|| (i%5==0)){
                hap += i;
            }
        }
    }
}
