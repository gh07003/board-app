package ch2.Ex15_변수와메서드;

/*
    클래스 메서드와 인스턴스 메서드의 차이 확인함
    클래스 메서드는 static이 붙으며 별도로 인스턴스를 생성하지 않아도 사용 가능하다.
    클래스 메서드는 인스턴스 변수 사용할 수 없다.


 */

public class Ex15_1_변수와메서드 {
    public static void main(String[] args) {
        System.out.println("main 시작");
        firstMethod();

        System.out.println("main 끝");
    }

    static void firstMethod() {
        System.out.println("firstMethod 시작");
        secondMethod();

        System.out.println("firstMethod 끝");
    }

    static void secondMethod() {
        System.out.println("secondMethod 시작");


        System.out.println("secondMethod 끝");
    }
}
