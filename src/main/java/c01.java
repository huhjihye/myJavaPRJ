import java.util.LinkedList;
import java.util.List;

public class c01 {
    public static void main(String[] args) {
        List<String> list =new LinkedList<>();

        //List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        list.add("허지혜");
        list.add("김원집");


        //List의 데이터 수 구하기
        int listSize = list.size();

        //List 객체에 저장된 값 출력하기
        //여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        //우리가 지난 시간에 배운 방법
        for(int i=0;i<listSize;i++){
            System.out.println("이름 :  " + list.get(i));
        }
    }
}
