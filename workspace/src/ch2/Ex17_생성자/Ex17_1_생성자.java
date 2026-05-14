package ch2.Ex17_생성자;

/*
    - 생성자란?
        메서드처럼 클래스 내부에 선언됨.
        구조도 메서드와 비슷하지만 리턴값이 없다.
        인스턴스 변수들을 초기화 하는 용도로 사용된다.
        생성자의 이름은 무조건 클래스 이름과 같아야한다.
        모든 클래스에는 한 개 이상의 생성자가 반드시 있어야 함
        (기본 생성자는 생략 가능하지만, 커스텀 생성 사용 시 기본 생성자도 빈 상태로라도 만들어줘야함)
 */

public class Ex17_1_생성자 {
    public Ex17_1_생성자() {

    }

    String name;
    public Ex17_1_생성자(String uName) {
        this.name = uName;
    }

    public static void main(String[] args) {

        Ex17_1_생성자 c = new Ex17_1_생성자();

        Ex17_1_생성자 c2 = new Ex17_1_생성자("홍길동");
    }
}
