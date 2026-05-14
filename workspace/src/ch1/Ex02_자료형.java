package ch1;

import java.util.ArrayList;
/*
    자료형
        컴퓨터가 이해할 수 있는 값의 형태 '자료형'
        (사람으로 따지면 '문자', '숫자' 같은거임)
        Java의 자료형 Primitive Type (기본자료형) , Reference type(참조 자로형) 으로 구분된다.

        * 인스턴스를 생성하면 heap 영역에 값이 저장됨.
        힙 영역 안에는 String pool 이라는 영역이 따로 있음.

        1) 리터럴(기본 자료형) 방식으로 값을 만들면 String pool 영역에 값이 저장되고, 그 값을 여러 변수들에 저장하면 같은 주소값을 공유할뿐 새로 메모리에 값을 저장하진 않는다.
        2) new 를 이용해서 String 을 생성하면 그냥 Heap 영역에 저장된다. 끝


    1) 기본 자료형 - Primitive Type

        문자형 - 따옴표 있으면 무조건 문자형
            1) char - (16bit = 2bype)
                기본값: '\u0000'
                문자 하나 저장 가능
                * String - 기본자료형 아님. 참조자로형임
        숫자형 - 따옴표나 쌍따옴표 없고 숫자형태의 자료
        정수형
            2) byte - (8bit = 1byte), -128~127
                    기본값: 0
            3) short - (16bit = 2byte), (-32,768~32,767)
                    기본값: 0
            4) int - (32bit = 4byte), (약 +-21억 근처)
                    기본값: 0
                    정수형에서 기본형
            5) long - (64bit = 8byte), (2^63), (엄청나...)
                    기본값: 0L

        실수형
            6) float - (32bit = 4byte)
                        기본값: 0.0f
            7) double - (64bit = 8byte)
                        기본값: 0.0
                        실수형에서의 기본형

        논리형
            8) boolean - (8bit = 1byte)
                        기본값: false

    2) 참조 자료형 - Reference type
        객체의 주소를 저장
        '기본 자료형'을 제외한 모든 자료형 말한다. 라고 보통 말하지만 그냥 글래스 이름으로 변수타입 쓰면 그게 다 참조변수임
        ex) '클래스이름 변수명'  방식으로 만들어지면 다 참조 변수
            Tv t = new Tv();

        가장 대표적인 참조 자료형: String
            String str = new String();

    3) 자료형 확인 - 자료형 확인시 Wrapper 클래스 타입으로 된 변수들을 Class 클래스의 getClass()와 getName() 을 이용해서 함
                    기본형들은 Wrapper 클래스로 변환 해야함

 */

public class Ex02_자료형 {
    public static void main(String[] args) {
        // 참조 자로형 & 자료형 확인 예제
        String str1 = "abc";
        char c = 'A'; // 문자 하나 넣을수 있는 char 는 쌍따옴표 안됨. 따옴표만 가능
        String str2 = "a"; // 여러 문자 넣을수 있는 String 은 쌍따옴표만 됨

        Integer num1 = 100;
        int num2 = 100;

        ArrayList<String> list = new ArrayList<>();
        char[] arr = new char[3]; // char 로 만들지만 실제로는 [char, char, char] 로 된 배열

        System.out.println(str1.getClass().getName());
        System.out.println(Character.valueOf(c).getClass().getName());
        System.out.println(list.getClass().getName());
        System.out.println(arr.getClass().getName());


        System.out.println("=========================");
        // 기본형
        int i1 = 10;
        int i2 = 10;

        System.out.println(i1);  // 10
        System.out.println(i2);  // 10
        System.out.println(i1 == i2); // true


        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1);  // abc
        System.out.println(s2);  // abc
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2)); // true

    }
}