package ch1;

/*
    반복문: 같은 자리에서 같은 작업을 반복

    1)  for (초기식; 조건식; 증감식) {
            ...
        }

    2) for each (향상된 for 문)
        for each 문은 Array 객체에서만 사용 가능한 매서드(ES6 부터는 Map, Set 지원)

        for(변수타입 변수이름 : 배열) {

        }

        for(int num : array) {
            System.out.println(num);
        }

 */


import java.util.Scanner;

public class Ex11_반복문 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};

        for(int num : array) {
            System.out.println(num);
        }

        System.out.println("==============");

        for(int i = 0; i< 10; i++) {

//            if(i < 3) {
//                System.out.println(i);
//            }
//            else {
//                break;
//            }

            if(i >= 3) break;
            System.out.println(i);

//            i >= 3?break:System.out.println(i);
        }


        System.out.println("==========================================");

        boolean tmp = true;
        int input = 0;
        while(tmp) {
            System.out.println("숫자입력");
            Scanner sc = new Scanner(System.in);

            if(sc.hasNextInt()) { // hasNextInt: 정수 입력시 true, 아니면 false
                input = sc.nextInt();
                if(0 < input && input < 100 ) {
                    tmp = false;
                }
            }
        }
        System.out.println(input +" 이 입력되었음");
    }
}
