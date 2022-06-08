package study;

public class ip_01 {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        //1.ip 주소 빼기
        //2. 날짜, 시간 빼기
        String ip =log.substring(0, log.indexOf(" "));
        System.out.println("ip :"+ip);

        String []a=log.split(" ");
            System.out.println(a[0]);

            //2. 날짜, 시간 빼기
        System.out.println(a[3].substring(1));

    }



}
