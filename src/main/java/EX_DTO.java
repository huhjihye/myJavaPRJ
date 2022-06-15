import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class EX_DTO {
    private String test;
    private int score;

    // Alt + Insert 누르고 getter and setter 누르기
    //변수명 앞에 get넣고 가져오기 ,
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test; //this 는 자기 자신을 이야기함 (== EX_DTO를 뜻함)
        //THIS를 붙인 이유는 7,8라인에 있는 아이랑 11라인에 있는 test아이랑 다른 아이기 때문에 이름만 같음.
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
