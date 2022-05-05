package study;

import java.util.ArrayList;
import java.util.List;

public class lis01 {
    public static void main(String[] args) {
        List<String>aa = new ArrayList<>();

        aa.add("허짛");
        aa.add("혜졔");
        aa.add("알알");

        int aasize =aa.size();

        for(int i=0; i< aasize; i++){
            System.out.println("이름 : " + aa.get(i));
        }
    }
}
