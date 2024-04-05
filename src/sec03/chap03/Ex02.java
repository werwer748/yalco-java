package sec03.chap03;

public class Ex02 {
    public static void main(String[] args) {

        char ch_a1 = 'A';
        int int_a1 = (int) ch_a1;

        //  정수값을 얻는 다른 방법들 - 정수값과 연산하기
        int int_a2 = ch_a1 + 0;
        int int_a3 = ch_a1 - 0;
        char int_a4 = ++ch_a1;
        int int_a5 = --ch_a1;

        //  💡 리터럴에 더할 때와 변수에 더할 때 반환 자료형이 다름
        char ch_a2 = 'A' + 1;
//        char ch_a3 = ch_a1 + 1; // ⚠️ 불가
        int int_a6 = ch_a1 + 1;

    }
}
