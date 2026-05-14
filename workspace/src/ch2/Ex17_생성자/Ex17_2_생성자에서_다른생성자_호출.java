package ch2.Ex17_생성자;

/*
    this()와 this의 차이

    this()는 '같은 클래스'의 '다른 생성자'를 호출할때 사용
    this는 인스턴스 변수와 매개변수의 이름이 같은 경우 인스턴스 변수 앞에 붙여서 구분할 수 있게한다.
 */

class Car {
    String color;
    String gearType; // 변속기 종류 - auto, manual
    int door;

    Car() {
        this.color = "white";
        this.gearType = "Auto";
        this.door = 4;
    }
    Car (String color) {
        this.color = color;
        this.gearType = "Auto";
        this.door = 4;
    }


}

public class Ex17_2_생성자에서_다른생성자_호출 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car("blue");
    }
}
