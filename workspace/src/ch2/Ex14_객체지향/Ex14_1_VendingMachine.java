package ch2.Ex14_객체지향;
/*
    자판기 클래스 만들기
    숫자 1 누르면 "콜라"
    숫자 2 누르면 "사이다" 출력되는 코드 짜보기
 */

public class Ex14_1_VendingMachine {
    // field (자판기가 가질 수 있는 객체들)
    // constructor (생성자)
    // method (자판기가 가질 수 있는 기능들)
    public String pushButton(int menuId) {
        if (menuId == 1) {
            return "콜라";
        } else if (menuId == 2) {
            return "사이다";
        }
        return "";
    }

    ///////////////////////////////////////////////////
    private String tmp;

    public String getTmp() {
        return tmp;
    }
    public void setTmp(String tmp) {
        this.tmp = tmp;
    }
    @Override
    public String toString() {
        return "Ex14_1_VendingMachine{" +
                "tmp='" + tmp + '\'' +
                '}';
    }
}
