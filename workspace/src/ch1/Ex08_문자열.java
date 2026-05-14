package ch1;

public class Ex08_문자열 {
    public static void main(String[] args) {

        String s = "ABCDEFGHIJKLMDEFNOPQRSTUVWXYZ";

        System.out.println(s);

        System.out.println("문자열 길이: " + s.length());

        System.out.println("대문자 변환: " + s.toUpperCase());
        System.out.println("소문자 변환: " + s.toLowerCase());

        System.out.println("포함 확인: " + s.contains("EFG"));

        System.out.println("몇번째: " +s.indexOf("DEF")); // -1 이면 없다. 0이상이면 있다.
        System.out.println("몇번째: " +s.lastIndexOf("DEF")); // -1 이면 없다. 0이상이면 있다.


        // 문자열 결합
        String s2 = "태정태세문단세";
        String s3 = "자축인묘신사오미";
        System.out.println(s2.concat(", ").concat(s3));


        // 문자열 비교
        // == : 주소값 비교
        // equals() : 모양만 비교
        String s4 = "java";
        String s5 = "java";
        String s6 = new String("java");
        String s7 = new String("JAVA");
        String s8 = "JAVA";
        System.out.println(s4 == s5); // true
        System.out.println(s4 == s6); // false
        System.out.println(s4.equals(s6)); // true
        System.out.println(s6.equals(s7)); // false
        System.out.println(s4 == s8); // false


    }
}