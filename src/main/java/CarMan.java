class Car1{
    private int price;

    Car1(){
        System.out.println("난 메모리에 올라갈 때 생성된다.");
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;

    }
}

public class CarMan {
    public static void main(String[] args) {
        Car1 hglee=new Car1();

    }
}














//