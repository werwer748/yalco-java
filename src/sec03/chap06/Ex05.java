package sec03.chap06;

public class Ex05 {
    public static void main(String[] args) {

        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";

        //  💡 compareTo : 사전순 비교에 따라 양수 또는 음수 반환

        //  같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1);

        //  시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2);
        int int_a2_2 = str_a2.compareTo(str_a1);
        int int_a3 = str_a1.compareTo(str_a3);
        int int_a4 = str_a2.compareTo(str_a3);
        int int_a5 = str_a3.compareTo(str_a1);

        String str_a4 = "HIJKLMN";

        //  시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        int int_a6 = str_a1.compareTo(str_a4);
        int int_a7 = str_a4.compareTo(str_a3);

        String kr1 = "할아버지";
        String kr2 = "할머니";
        String long_kr = "할아버지 어렸을적에";
        int int_k1 = kr1.compareTo(kr2);
        int int_k2 = kr2.compareTo(kr1);
        char char_kr1 = '아';
        char char_kr2 = '머';
        int int_k3 = kr1.compareTo(long_kr);
        int int_k4 = long_kr.compareTo(kr1);

        String str_b1 = "abc";
        String str_b2 = "DEF";

        int int_b1 = str_b1.compareTo(str_b2);

        //  💡 compareToIgnoreCase : 대소문자 구분 없이 비교
        int int_b2 = str_b1.compareToIgnoreCase(str_b2);
    }
}
