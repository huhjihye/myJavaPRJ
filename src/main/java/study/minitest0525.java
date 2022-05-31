package study;

public class minitest0525 {
    public static void main(String[] args) {
        //Access_log 서버 로그 샘플
        //다음 log 변수에서 IP만 추출하여 출력하도록 프로그래밍 코드를 작성하시오.
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";
        int pos= log.indexOf(" "); //공백으로 자르기
        System.out.println("pos : " +pos);

        String ip =log.substring(0, pos);
        System.out.println("ip : " +ip);

        String[] item =log.split(" ");
        System.out.println("ip : " +item[0]);



// 다음 log 변수에서 호출시간을 추출하여 출력하는 코드를 작성하시오
        System.out.println("time : "+item[3]);
        // "[" 빼줘야한다...
        String time =item[3].substring(1);
        System.out.println("time : " +time);
    }
}
