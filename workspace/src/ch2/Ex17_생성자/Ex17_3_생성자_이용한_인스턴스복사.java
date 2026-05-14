package ch2.Ex17_생성자;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "Auto", 4);
    }
    Car2 (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car2(Car2 c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

}

public class Ex17_3_생성자_이용한_인스턴스복사 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(c1);
        System.out.println("c1: " + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2: " + c2.color + ", " + c2.gearType + ", " + c2.door);

        c1.door = 100;
        System.out.println(c2.door); // c1과 c2는 각각 다른 객체이기 때문에 c1의 값을 바꿔도 c2는 바뀌지 않는다.
        System.out.println(c1 + ", " + c2);
    }
}
