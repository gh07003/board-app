package ch2.Ex18_상속;

/*
    - 상속
        새로운 클래스를 정의할때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하는 클래스를 구현한다.
        (이미 구현된 클래스보다 더 구체적인 기능을 가지는 클래스를 구현해야 할때 상속함)

        - 단일 상속만 가능 (부모 여러개 안됨)
        - 부모가 상속받고 있는 클래스라면 자식은 조상꺼까지 다 상속받게된다.
        - 자식 변경 시 부모 영향 없음. 부모 변경 시 자식 영향 받음

        상속하는 클래스: 상위 클래스 parent class, base class, super class 라고 부름
        상속받는 클래스: 하위 클래스 child class, derived class, sub class 라고 부름

    - 문법
        - class Parent {}
        - class Child extends Parent {}
 */

class Parent {
    int eye = 2;
    int nose = 1;
    int mouse = 1;
    String race = "황인종";
    String name = "홍길동";
    String gender = "남";

    public void gait() {
        System.out.println("팔자걸음");
    }
}
class Child_1 extends Parent {
    String name = "이방원";
}

class Child_2 extends Parent {
    String name = "김말숙";
    String gender = "여";

    public void breath() {
        System.out.println("죠낸 빠르게 숨쉰다");
    }
}

class GrandChild extends Child_2 {
    @Override
    public void gait() {
        System.out.println("정상 걸음");
    }
}

public class Ex18_1_상속 {
    public static void main(String[] args) {
        Child_1 c1 = new Child_1();
        System.out.println("자식1 - 눈: " + c1.eye);
        System.out.println("자식1 - 이름: " + c1.name);
        System.out.println("------------------------");

        Child_2 c2 = new Child_2();
        System.out.println("자식2 - 눈: " + c2.eye);
        System.out.println("자식2 - 이름: " + c2.name);
        c2.breath();
        System.out.println("------------------------");
        // 여기까지는 부모 자식 관계만 생각하면 됨

        //
        GrandChild gc1 = new GrandChild();
        System.out.println("손주1 - 눈: " + gc1.eye);
        System.out.println("손주1 - 이름: " + gc1.name);
        gc1.gait();
        gc1.breath();
    }
}
