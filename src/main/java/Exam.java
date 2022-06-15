public class Exam {
        public static void main(String[] args) {
            EX_DTO eDTO = new EX_DTO();

            eDTO.setTest("기말고사");
            eDTO.setScore(100);

            System.out.println("시험 : "+ eDTO.getTest());
            System.out.println("점수 : "+ eDTO.getScore());
        }
    }


