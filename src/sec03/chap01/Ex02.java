package sec03.chap01;

public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallNum = 123;

        // 명시적(강제) 형변환(casting)
        byteNum = (byte) smallNum;

        int intNum = 12345;
        // 강제로 범위 밖의 숫자를 넣으면 값이 손실된다.
        byteNum = (byte) intNum; // byteNum = 57 이됨 12345 % 128 로 계산된 거라고 함.
    }
}
