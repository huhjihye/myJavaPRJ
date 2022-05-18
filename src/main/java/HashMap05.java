import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap05 {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "florw@naver.com");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "g.d@gmail.com");
        map.put("addr", "경기");
        map.put("name", "시각디자인과");

        list.add(map);

        map = null;

        list.forEach(rMap -> {
                    System.out.println("name : " + rMap.get("name"));
                    System.out.println("email : " + rMap.get("email"));
                    System.out.println("addr : " + rMap.get("addr"));
                    System.out.println("dept : " + rMap.get("dept"));


                }
        );
    }
}
