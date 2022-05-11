import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c3 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();


        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");
        list.add("허지혜");
        list.add("김원집");


        for(String name : list) {
            System.out.println("이름 :" +name);
        }

        list.forEach(name -> System.out.println("name :" +name));

        Iterator<String> it =list.iterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " +name);
        }
    }
}
