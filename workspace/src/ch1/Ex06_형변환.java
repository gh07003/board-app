package ch1;

/*
    - 형변환(캐스팅, casting)

    boolean 형을 제외한 모든 자료형은 형태를 변환할 수 있다.(주의: 숫자를 문자열로 변환하는건 다르게 해야함)
        1) '자동 형변환'
        2) '캐스팅' 작업을 해야 하는 형변환

    - 변환 방법
        1) 숫자 -> 다른 숫자형
            (변환할 타입) 값
            ex) double d = 3.14;
                int i = (int) d;

        2) 숫자 -> 문자


 */

import javax.swing.text.Style;

public class Ex06_형변환 {
    public static void main(String[] args) {

        // 1) 숫자 -> 다른 숫자형
        double d = 3.14;
        System.out.println(d); // 3.14

        int i = (int) d;
        System.out.println(i); // 3

        double d2 = i; // 3.14 / 3
        System.out.println(d2); // 3.0

        System.out.println("--------------------------");
        // 2) 숫자 -> 문자
        // 두가지 방법 있음

        //  String.valueOf(숫자)
        String s1 = String.valueOf(100.01); // 정수 실수 다 가능
        System.out.println(s1);
        System.out.println(s1 instanceof String);

        // 3) 문자열 -> 숫자
        String str1 = "100";
        String str2 = "100.01";

        Integer num1 = Integer.parseInt(str1);
        Double num2 = Double.parseDouble(str2);
        System.out.println(num1);
        System.out.println(num2);



    }
}