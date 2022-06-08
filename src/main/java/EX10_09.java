import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EX10_09 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/test/data1.txt"); //c드라이브 되도록 사용하지 않기 c: 제거
        //변수 fis 주고, new로 메모리에 올리기 (파일도 읽어서 같이 올려라)
        // 파일의 내용을 한칸한칸 읽는 방식 사용
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        //utf-8에서 한국어 다 읽을 수 있음 / 앞에서 읽은 거를 다시 읽어라
        int ch; //한글자 한글자 읽어오기 위한 변수 만듬

        while ((ch = isr.read()) != -1) {
           /* while ((ch = fis.read()) != -1) { //스트림에서 읽은 값들을 while문을 돌릴건데, -1(파일 다 읽었다는 뜻) 즉 끝까지 다 읽고 멈춰라
                //-1은 FileInputStream에서 사용*/
            System.out.print((char) ch); //char 형태로 넘겨서 출력해라
        }
                fis.close(); //파일 닫기
            }
        }

