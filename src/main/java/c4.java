import java.util.HashMap;
import java.util.Map;

public class c4 {
    public static void main(String[] args) {
        Map<String, String> map =new HashMap<>();

        map.put("name", "huh jihye");
        map.put("email", "floramiss@naver.com");
        map.put("dept", "데이터분석과");

        System.out.println("------------------------");

        System.out.println("name :" + map.get("name"));
        System.out.println("email :" + map.get("email"));
        System.out.println("dept :" + map.get("dept"));

        System.out.println("--------------------------------");
    }
}
