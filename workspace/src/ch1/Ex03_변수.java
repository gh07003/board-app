
/*
    변수란: 값을 저장할 수 있는 박스(공간) 을 의미한다
           하나의 변수에 하나의 값만 저장할 수 있다.

    변수 종류
        1) 클래스 변수 (cv)
            static 으로 선언된 변수
            클래스가 메모리에 올라갈때 생성됨.(그래서 별도의 인스턴스 생성 없이 '클래스이름.변수명' 으로 사용 가능

        2) 인스턴스 변수 (iv)
            class 시작하자 마자(main() 같은 메서드 밖에) 선언되는 변수
            클래스가 인스턴스화 될때 초기화 되는 변수
            인스턴스를 통해서만 접근 가능

        3) 지역 변수 (lv)
            메소드 내부에 선언된 변수
            멤버변수와 동일한 이름을 가질수 있고, 지역변수가 우선
            *멤버변수란: 클래스 영역에 있는 모든 타입(cv, iv)의 변수

        4) 매개 변수 (parameter)
            메서드에 인자로 전달되는 값을 받기 위한 변수
            메서드 내에서는 지역변수처럼 사용됨.

    - 변수 생성
        1) 변수 선언 - 변수타입 변수명
                    ex) int num;
                        char c;
                        String stmt;
                        boolean result;
        2) 변수 초기화 - 변수 선어시 빈 박스로 두지 말고, 기본으로 사용할 값을 넣어주는걸 말한다.
                        이유: 박스에 이름표 붙여서 쓸건데, 이름표를 붙이기 전에 그 박스 안에 어떤 값이 들어있는지 모르잖슴.
                             그래서 일단 내가 쓸 형태의 값을 아무거나 넣어두자
                             ex) int num = 0;
                                char c = 'a';
                                String stmt = '문자열;
                                boolean result = true;
                        *참조형 변수 - null


        - 변수명 생성 규칙
            1) 공백 불가
                ex) String bit study; (X)
                    String bit_study; (O)
                    String bitStudy;  (O)

            2) 시작글자는 영문, _, $ 중에 하나로 시작
            3) 예약어 금지 - this 이런거
            4) 같은 변수명 생성불가
            5) 대소문자 구분: tmp, Tmp, tMp, tmP, TMp...

        - 상수: final
                책에서는 '변하지 않는 데이터를 의미' 또는 '그 자체로 값을 의미하는 변수'
                다 필요 없음

                아래거들만 기억하면 됨
                1) 등호(=) 오른쪽에 있는건 다 리터럴
                2) final 붙은건 다 상수
                    가급적 상수는 대문자로 하기

                    ex) int num = 10; // 상수 아님
                        final int NUM2 = 10; // 상수


 */
public class Ex03_변수 {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 10
        System.out.println(Integer.valueOf(num)); // 10
        System.out.println(Integer.valueOf(num).getClass()); // class java.lang.Integer
        System.out.println(Integer.valueOf(num).getClass().getName()); // int의 자료형 확인. java.lang.Integer

        long l = 10L;
        long l2 = num;
        System.out.println(l2); // 내부에 int 값이 있어도 겉 포장은 long 이기 때문에 최종 자료형은 long 임
        System.out.println(Long.valueOf(l2).getClass().getName()); //


//        int num2 = l;
//        System.out.println(num2);
    }
}