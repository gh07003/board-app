package ch1;

public class Ex04_출력1 {
    static int numnum = 1000; // ci - 클래스변수. 기본적으로 메모리에 올라가져있어서 그냥 사용가능. 사용법: 클래스명.변수명
    int num = 100; // iv - 인스턴스 변수. 누군가 메모리에 올려줘야 사용할 수 있는 변수. 사용법: 인스턴스.변수명
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        Ex04_출력1 ex04 = new Ex04_출력1();
        System.out.println(ex04.num);

        System.out.println(Ex04_출력1.numnum); //
//        -------------------------------------------------

        System.out.println(100 + 100);  // 200
        System.out.println(100 + "100");  // 100100
        System.out.println("100 + 100");  // 100 + 100

        System.out.println("100" + 100 + 100);  // 100100100
        System.out.println("100" + (100 + 100));  // 100200

        System.out.println(100 + 100 + "100");  // 200100
        System.out.println((100 + 100) + "100");  // 200100

        System.out.println("---------------------------------");
//        System.out.println(100 + true); // 에러
        System.out.println(100 + "true");
        System.out.println("true" + 100);
//        System.out.println(true + true);
    }
}