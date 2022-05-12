package study;

import java.util.HashMap;

public class HASH {
    public static void main(String[] args) {

        HashMap map = new HashMap();


        map.put(4, "FOUR");
        map.put(16, "허지혜");
        map.put(2, "TWO");
        map.put(3, "THIRD");
        map.put(1, "ONE");

        System.out.println(map);
        System.out.println("------------------------------------");

        System.out.println(map.keySet());
        System.out.println("------------------------------------");

        System.out.println(map.values());
        System.out.println("------------------------------------");

        System.out.println("key값 7의 value는? " + map.get(7));
        System.out.println("key값 2의 value는? " + map.get(2));
        System.out.println("------------------------------------");

        map.put(16, "@허지혜@");
        System.out.println(map);
        System.out.println("------------------------------------");

        map.remove(16);
        System.out.println(map);
        System.out.println("------------------------------------");


        if (map.containsKey(1)){
            System.out.println("key값 1의 value는 " + map.get(1) + "입니다.");
            System.out.println("------------------------------------");
        }


        if (map.containsValue("TWO")){
            System.out.println(map.get(2) + "입니다.");
        }
    }
}
