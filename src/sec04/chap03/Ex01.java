package sec04.chap03;

public class Ex01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1); // 🔴
        }

        //  루프 블록 안에서 변수값을 바꾸는 것으로 4번 과정 대신 가능
        for (int i = 0; i < 10;) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("\n- - - - -\n");

        for (double d = 123.45; d > 0; d -= 32.1) {
            System.out.println(d);
        }

        for (String s = ""; s.length() < 11; s += s.length()) {
            System.out.println(s);
        }

        System.out.println("\n- - - - -\n");

        //  💡 쉼표로 구분하여 여럿 사용 가능
        //  ⚠️ 변수의 자료형은 한 종류만 가능 (혼용 안 됨)
//        for (byte a = 0, b = 10; a <= b;) {
//            System.out.printf("a: %d, b: %d%n", a++, b--);
//        }

        // ⚠️ 다른자료형을 쓰고싶을때 변수를 밖으로 빼서 사용하면 된다.
        double b = 10.0;
        byte a = 1;
        for (; a <= b;) {
            System.out.printf("a: %d, b: %f%n", a++, b--);
        }

        System.out.println("\n- - - - -\n");

        //  윷놀이 예제에 적용
        String yuts = "도개걸윷모";
        char yut = '모';

        boolean isValid = false;
        for (int i = 0; i <= yuts.indexOf(yut); i++) {
            isValid = true;
            System.out.println("앞으로");
        }
        if (!isValid) System.out.println("무효");
    }
}
