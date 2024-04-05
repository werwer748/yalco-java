package sec03.chap03;

public class Ex01 {
    public static void main(String[] args) {

        //  각 문자는 상응하는 정수를 가짐
//        char ch1 = ''; // 에러 빈문자 사용 못함 (공백과는 다름)
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'a';
        char ch4 = 'a' + 1;
        char ch5 = '가';
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나';

        int ch1Int = (int) ch1;
        int ch9Int = ch9; // 캐스팅 안해줘도 묵시적 형변환 됨.

        // 문자 리터럴과 숫자, 유니코드로 표현 가능
        char ch10 = 'A';
        char ch11 = 65;
        boolean bool = ch10 == ch11; // true ㄷㄷ..
        char ch12 = '\u0041';

        //  💡 int 1과 char '1'은 다름! - 문자로서의 '1'
        //  - 해당 문자의 정수값 확인
        char ch_b1 = '1';
        char ch_b2 = '2';

        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
        char ch_b3 = '1' + '2';
        int int_b4 = ch_b1 + ch_b2;

        //  💡 아래의 기능으로 문자가 의미하는 정수로 변환
        int int_d1 = Character.getNumericValue('1');
        int int_d2 = Character.getNumericValue('2');
        int int_d3 = '5' - '0'; // 48번이 문자 '0' 그뒤로 숫자가 올라가서 저렇게 빼면 실제 숫자 5가 나온다.
        int int_d4 = '2' - '0'; // 48번이 문자 '0' 그뒤로 숫자가 올라가서 저렇게 빼면 실제 숫자 5가 나온다.

        //  ⚠️ 빈 문자는 사용 불가, 공백(space)는 가능
        //  - 이후 배울 문자열(String)과의 차이
//        char empty = '';
        String emptyStr = "";

        char space = ' ';
        char two = '2';
        char zero = '0';
    }
}
