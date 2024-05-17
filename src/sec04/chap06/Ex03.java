package sec04.chap06;

public class Ex03 {
    // 재귀함수 - 스스로를 호출하는 메서드, java에서는 지양하는게 좋음
    public static void main(String[] args) {
        upTo5(0);
        upTo5(2);
        upTo5(4);

        int fact1 = factorial(1);
        int fact2 = factorial(2);
        int fact3 = factorial(3);
        int fact4 = factorial(4);
        int fact5 = factorial(5);
    }

    static int factorial (int num) {
        return num == 0 ? 1 : num * factorial(--num);
    }

    // 보기에 난해한 부분이 있음
    // 다른 메소드를 호출한 메소드는 호출된 메소드가 종료될 때까지 메모리에 남아 있음 - 호출이 반복될수록 위와 같이 메소드들이 쌓이게 됨
    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("-- 종료 --");
        }
    }
}
