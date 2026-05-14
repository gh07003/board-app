import java.util.Scanner;

public class Ex12_구구단_가로 {
/*
    == 2단 ==
    2 * 1 = 2
    2 * 2 = 4
    2 * 3 = 6
    2 * 4 = 8
    2 * 5 = 10
    2 * 6 = 12
    2 * 7 = 14
    2 * 8 = 16
    2 * 9 = 18

    == 3단 ==
    3 * 1 = 3
    3 * 3 = 6
    3 * 3 = 9
    3 * 4 = 12
    3 * 5 = 15
    3 * 6 = 18
    3 * 7 = 21
    3 * 8 = 24
    3 * 9 = 27
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int dan1 = sc.nextInt();
//        int dan2 = sc.nextInt();
//
//        for(int i = dan1; i <= dan2; i++) {
//            System.out.println("== " + i + "단 ==");
//            for(int j = 1; j <= 9; j++) {
//                System.out.println(i + "*" + j + "=" + (i * j));
//            }
//            System.out.println();
//        }


        // 가로방향

        int dan1 = 2;
        int dan2 = 4;

        for(int i = dan1; i <= dan2; i++) {
            System.out.print("== " + i + "단 ==\t\t");
        }
        System.out.println();

        for(int i=1; i<=9; i++) {
            for(int j=dan1; j<=dan2; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) +"\t\t\t");
            }
            System.out.println();
        }
    }
}