package sec04.chap05;

public class Ex03 {
    public static void main(String[] args) {
        sayHello();

        int count1 = getCount();
        int count2 = getCount();
        int count3 = getCount();
        int count4 = getCount();
    }

    static int count = 0;

    //  매개변수 없이 값만 반환하는 메소드
    //  외부 변수 값을 변화시킴 (static이므로 static 변수만 가능)
    // ⚠️ 외부의 변수 값을 바꾸는 것은 좋은 메서드가 아님 - 추적이 어려움
    static int getCount () { //! 반환값의 자료형도 주의해서 쓸 것.
        System.out.println("카운트 증가");
        return ++count;
    }

    //  매개변수도, 반환값도 없는 메소드
    static void sayHello () {
        System.out.println("안녕하세요!");
    }
}
