package sec04.chap04;

public class Ex03 {
    public static void main(String[] args) {
        // * do ... while은 기능 수행 후 조건을 확인
        int enemies = 0;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies > 0) enemies--;
        } while (enemies > 0);

        System.out.println("사격중지 아군이다");

        System.out.println("\n- - - - -\n");

        int x = 11;
        int y = x;

        while (x < 10) {
            System.out.println("while 문: " + x++);
        }

        do {
            System.out.println("do ... while 문: " + y++);
        } while (y < 10);
    }
}
