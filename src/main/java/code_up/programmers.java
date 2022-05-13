package code_up;

import java.util.HashMap;
import java.util.Map;

public class programmers {

    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap();
        //map1 put
        map1.put("map1-key1", 100);
        map1.put("map1-key2", 200);

        //map2 put
        map2.put("map2-key3", 300);
        map2.put("map2-key4", 400);

        System.out.println("map1:"+map1);
        System.out.println("map2:"+map2);

        //map2에 map1을 합침
        map2.putAll(map1);
        System.out.println("map2 includes map1:"+map2);

        //map1의 키, 값 변경
        map1.put("map1-key1", 1000);
        //map2에는 영향 없음.
        System.out.println("map2 includes map1:"+map2);

    }
    }


