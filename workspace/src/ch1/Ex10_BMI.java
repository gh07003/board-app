package ch1;


import java.util.Scanner;

public class Ex10_BMI {
    public static void main(String[] args) {
        // 공식:  체중(kg) / 신장(m)^2

        double weight = 150.0;
        double height = 185.0 * 0.01;

        double bmi = weight / (height * height);

        System.out.println(String.format("%.2f", bmi));

//        저 체 중	18.5미만	            낮음	보통
//        정상	    18.5이상 ~ 22.9이하	보통	약간높음
//        비만전단계	23이상 ~ 24.9이하	약간높음	높음
//        1단계 비만	25이상 ~ 29.9이하	높음	매우높음
//        2단계 비만	30이상 ~ 34.9이하	매우높음	가장높음
//        3단계 비만	35이상	            가장높음	가장높음

//        if(bmi < 18.5) {
//            System.out.println("저 체 중");
//        }
//        else if(18.5 <= bmi && bmi <= 22.9) {
//            System.out.println("정상");
//        }
//        else if(23 <= bmi && bmi <= 24.9) {
//            System.out.println("비만전단계");
//        }
//        else if(25 <= bmi && bmi <= 29.9) {
//            System.out.println("1단계 비만");
//        }
//        else if(30 <= bmi && bmi <= 34.9) {
//            System.out.println("2단계 비만");
//        }
//        else if(bmi >= 35) {
//            System.out.println("3단계 비만");
//        }
//////////////////////////////////////////////////////////
//        if(bmi < 18.5) {
//            System.out.println("저 체 중");
//        }
//        else if(18.5 <= bmi) {
//            System.out.println("정상");
//        }
//        else if(23 <= bmi) {
//            System.out.println("비만전단계");
//        }
//        else if(25 <= bmi) {
//            System.out.println("1단계 비만");
//        }
//        else if(30 <= bmi) {
//            System.out.println("2단계 비만");
//        }
//        else if(bmi >= 35) {
//            System.out.println("3단계 비만");
//        }

///////////////////////////////////////////////////////
        String result = "";
        if(35 <= bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 3단계 비만");
            result = "3단계 비만";
        }
        else if(30 <= bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 2단계 비만");
            result = "2단계 비만";
        }
        else if(25 <= bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 1단계 비만");
            result = "1단계 비만";
        }
        else if(23 <= bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 비만전단계");
            result = "비만전단계";
        }
        else if(18.5 <= bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 정상");
            result = "정상";
        }
        else if(18.5 > bmi) {
//            System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: 저 체 중");
            result = "저 체 중";
        }
        System.out.println("홍길동 님의 키는 xxx 고, 몸무게는 ㅌㅌ 이고 비만도는: "+ result);
    }
}