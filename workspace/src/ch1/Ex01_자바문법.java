package ch1;
/*
    1) 클래스 이름 첫글자 무조건 대문자로 생성
    2) 클래스 안에는 public 을 가지고 있는 클래스가 하나 있어야 한다.
        - public 달고 있는 클래스는 보통 파일명과 동일해야 함
        - public 은 두개 이상 있으면 안된다. (메서드는 가능)
        - 클래스 안에는 필드와 메서드가 올 수 있다.
    3) 클래스는 이름 뒤에 () 괄호 쓰지 않음
    4) 메서드는 클래스의 내부에 생성.
    5) 메서드는 생성시 리턴타입을 명시해야 한다. ex) String main(), void main()
    6) 메서드는 이름 뒤에 () 필수
    7) 작업이 끝날때마다 세미콜론 필수
 */

public class Ex01_자바문법 {
    public static void main(String[] args) {
        System.out.println("죠기");
        Tmp t = new Tmp();
        t.main();
        System.out.println(t);
    }
}

class Tmp {
    public static void main() {
        System.out.println("여기");
    }
}