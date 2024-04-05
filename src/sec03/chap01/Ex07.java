package sec03.chap01;

public class Ex07 {
    public static void main(String[] args) {

        // 💡 자료형의 범위를 넘어가도록 숫자를 더하거나 뺄 경우
        byte x = 127;
        x += 1; // 컴파일러가 잡아낼수가 없다. => -128이 됨 (제일 큰수 + 1 = 제일 작은수)

        byte y = -128;
        y -= 1;

    }
}
