class Car2 { //엄마 클래스
    String color;
    int speed;

    void upSpeed(int value) {
        speed = speed + value;
    }

    void downSpeed(int value) {
        speed = speed - value;
    }

}
class Sedan extends Car2 { //엄마 클래스 상속받음
    int seatNum; //나만 쓸 수 있는 고유 기능 만듬

    int getSeatNum() {
        return seatNum;
    }

}
class Truck extends Car2 { //엄마 클래스 상속받음
    int capacity; //나만이 가지고 있는 고유 기능 만듬

    int getCapacity() {
        return capacity;
    }

}
public class EX12_1 { // 메인함수
    public static void main(String[] args) {

        Sedan sedan1 =new Sedan(); // 클래스 명, 변수명 = new (메모리에 올려라 ), 생성자    ==> 생성자로 해서 메모리에 올림
        Truck truck1 =new Truck();

        sedan1.upSpeed(300); // 엄마가 가지고 있는 함수를 상속받고 실행한거.
        truck1.upSpeed(100); // 엄마가 가지고 있는 함수를 상속받고 실행한거.

        sedan1.seatNum=5; //본인꺼에 있는거에 값을 넣은것
        truck1.capacity=50; // 본인꺼에 있는것에 값을 넣은 것

        System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석수는" + sedan1.getSeatNum() + "개 입니다.");
        System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은" +truck1.getCapacity() + "톤 입니다.");
    }
}
