package ch1;

/*
    국영수 점 받고 평균 60점 미만 또는 한과목이라도 40 미만이면 과락

    각 점수
    평균
 */

import java.util.Scanner;

public class Ex09_조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오: ");
        String name = sc.nextLine();

        System.out.print("국어: ");
        int kor = sc.nextInt();
        System.out.print("영어: ");
        int eng = sc.nextInt();
        System.out.print("수학: ");
        int math = sc.nextInt();

        float avg = (kor + eng + math) / 3.0f;
        System.out.println(avg);
//
//        if(avg < 60) {
//            System.out.println("과락");
//        }
//        else if(avg >= 60) {
//            if(kor < 40 || eng < 40 || math < 40)
//                System.out.println("과락");
//
//            else
//                System.out.println("통과");
//        }
/////////////////////////////////////////////

        if(kor < 40 || eng < 40 || math < 40 || avg < 60) {
            System.out.println("과락");
        }
        else {
            System.out.println("통과");
        }
    }
}













