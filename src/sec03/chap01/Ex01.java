package sec03.chap01;

public class Ex01 {
    public static void main(String[] args) {
        //? 대부분 컴퓨터에서 1바이트 = 8비트

        // byte -128 ~ 127
        byte _1b_byte = 1;

        //short -32768 ~ 32767
        short _2b_short = 2;

        // int -2147483648 ~ 2147483647
        int _4b_int = 3; // * 일반적으로 많이 사용된다.

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long _8b_long = 4;

        //  ⚠️ 자료형의 범주 외의 수를 담을 수 없음
        byte overByte1 = 127;
//        byte overByte2 = 128;
        byte overByte3 = -128;
//        byte overByte4 = -129;

        //  큰 자료형에 작은 자료형의 값을 넣을 수 있음
        //  💡 묵시적(암시적) 형변환
        _2b_short = _1b_byte;
        _4b_int = _1b_byte; _4b_int = _2b_short;
        _8b_long = _1b_byte; _8b_long = _4b_int; _8b_long = _2b_short;

        //  ⚠️ 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        //  들어있는 값의 크기와 무관
//        _1b_byte = _2b_short; _1b_byte = _4b_int; _1b_byte = _8b_long;
//        _2b_short = _4b_int; _2b_short = _8b_long;
//        _4b_int = _8b_long;

        //  ⭐ int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        //  끝에 l 또는 L을 붙여 볼 것
        long _8b_long1 = 2147483648L; // 2147483647 까지는 L 안붙여도 따로 에러표시 없음
        long _8b_long2 = 2147483648l; // 소문자도 되지만 왠만하면 대문자로
//        long _8b_long3 = 2147483648;

        //  💡 가독성을 위해 아래와 같이 표현 가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long4 = 123_456_789_123_456_789L;

    }
}
