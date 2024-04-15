package sec03.chap08;

public class Ex05 {
    public static void main(String[] args) {

        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 🔴

        str1 = "고점에 익절";

        // 다른 참조형은? - 문자열처럼 int1만 바뀜
        Integer int1 = 1;
        Integer int2 = 2;
        int2 = int1; // 🔴

        int1 = 3;
    }
}
