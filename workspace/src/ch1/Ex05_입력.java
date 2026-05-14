package ch1;

import java.util.Scanner;

public class Ex05_입력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //  스캐너 클래스 객체 생성 -> heap에 올림

        System.out.println("이름을 입력하시오: ");
        String input = sc.nextLine();

        System.out.println("입력한 이름은 '" + input + "' 입니다.");

    }
}