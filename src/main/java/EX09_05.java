import java.util.Scanner;

public class EX09_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str= sc.nextLine();

        strRep =str.replace(" ", "$");   //공백을 $로 변환하기
        strSub= str.substring(3,8);   // 내가 원하는 값만 출력하고 싶을 때 3~8번째 값까지만
        strAry=str.split(" "); //공백을 기준으로 분리하세요.

        System.out.println("입력 문자열 ==> "+str);
        System.out.println("바꾼 문자열 ==> "+strRep);
        System.out.println("일부 문자열 ==> "+strSub);

        for(int i=0; i<strAry.length;i++){
            System.out.println("분리한 문자열" +i +"==>"+strAry[i]);
        }

        //Access_log 서버 로그 샘플
        String log= "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        //호출 시간 가져오기
        String [] item =log.split(" "); //공백으로 나누기

        for(int i=0; i<5;i++){
            System.out.println("item[" +i +"] : "+item[i]);
        }
        //item[3] : [11/Jun/2012:22:12:32t]

        String time =item[3];

        System.out.println("time : " +time.substring(1, time.length())); //1부터 문자열길이까지 즉 끝까지 라는 뜻 , 앞에 [ 이거 빼고 숫자만 가져오려고 !


    }
}
