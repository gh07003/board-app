/*
    - 객체지향
        1) 코드의 재사용성 높다
        2) 관리가 쉽다
        3) 중복 제거
        클래스로 만들어놓은 코드를 이용하기 때문에..

    - 핵심개념
        1) 캡슐화 - 데이터 보호
                    데이터 캡슐화: 필드와 메서드를 하나로 묶는것
            은닉화: 객체의 세부 내용이 외부에 드러나지 않아서 외부에서 데이터를 직접 접근하지 못하게 하는것
        2) 상속: 코드 재사용
                자식클래스 부모 클래스의 속성이나 기능을 물려받는것
                클래스를 상속 받아서 사용하기 때문에 중복 코드 줄일 수 있다.
                부모클래스가 수정이 되면 모든 자식클래스들도 수정되는 효과

        **3) 다형성 - 제일 중요
                    하나의 타입에 여러 객체를 대입
                    오버로딩, 오버라이딩

        4) 추상화 - 핵심적인 코드만 보여주기(불필요한 부분 숨긴다)
                    객체가 해야 하는 핵심적인 역할(코드)를 규정해놓고 실제 구현은 해당 인터페이스를 구현하는 각각의 객체에서 만들어서 씀

        5) 인터페이스 - 자바는 다중상속을 지원하지 않음. 그러나 다중 상속이 필요한 경우가 있기 때문에 인터페이스라는 일종의 추상 클래스를 사용한다.
 */

class Car {

    private String color; // 전역변수(멤버변수)
    private String model; // 전역변수(멤버변수)
    private int doorQty; // 전역변수(멤버변수)
    private int maxSpeed = 0; // 전역변수(멤버변수)

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoorQty() {
        return doorQty;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car() { /* 생성자 */
        maxSpeed = 100;
    }

    public Car(String color, String model, int doorQty) { /* 생성자 */
        this.color = color;
        this.model = model;
        this.doorQty = doorQty;
    }

    public void go() { // 메소드
        String txt="go"; // 지역변수
        System.out.println(txt);
    }
    public void stop() { // 메소드
        String txt="stop"; // 지역변수
        System.out.println(txt);
    }

}


public class Ex14_객체지향 {
    public static void main(String[] args) {
        Car sonata = new Car();
        Car benz = new Car("red", "C Class", 2);


        System.out.println(sonata);
        sonata.go();
        sonata.stop();
        System.out.println(sonata.getColor());
        System.out.println(sonata.getModel());
        System.out.println(sonata.getDoorQty());
        System.out.println(sonata.getMaxSpeed());

        System.out.println("================");

        System.out.println(benz);
        benz.go();
        benz.stop();
        System.out.println(benz.getColor());
        System.out.println(benz.getModel());
        System.out.println(benz.getDoorQty());
        System.out.println(benz.getMaxSpeed());
    }
}




