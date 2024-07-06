package sec05.chap06.ex01;

public class Main {
    public static void main(String[] args) {

        //  💡 가능 - 자식 클래스는 부모 클래스에 속함(부모 클래스타입이 정의된 필드에 담을 수 있음)
//        Button button1 = new Button("Enter");
//        Button button2 = new ShutDownButton();
//        Button button3 = new ToggleButton("CapsLock", true);
//
//        //  ⚠️ 불가
////        ShutDownButton button4 = new Button("Enter"); //! 부모를 자식에게 넣어줄 수는 없지
////        ToggleButton button5 = new ShutDownButton(); //! 형제관계
//
//        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
//        Button[] buttons = {
//                new Button("Space"),
//                new ToggleButton("CapsLock", false),
//                new ShutDownButton()
//        };
//
//        for (Button button : buttons) {
//            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
//            button.func();
//        }
        // ⭐️ 이처럼 특정 자료형의 자리에 여러 종류가 들어올 수 있는 것 - 다형성
        //? 상속, 오버라이딩, 인터페이스 등을 통해 구현 가능

        /**
         *  instanceof 연산자
         *  뒤에 오는 클래스의 자료형에 속하는(족보상 같거나 아래인) 인스턴스인지 확인
         *      - 인터페이스에 대해서도 사용 가능
         *  상속관계가 아닌 클래스끼리는 컴파일 오류
         *  */

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        // true
        boolean typeCheck1 = button instanceof Button; // 본인 instanceof 본인 = true
        boolean typeCheck2 = toggleButton instanceof Button; // 자식 instanceof 부모 = true
        boolean typeCheck3 = shutDownButton instanceof Button; // 자식 instanceof 부모 = true

        // false
        boolean typeCheck4 = button instanceof ShutDownButton; // 부모 instanceof 자식 = false
        boolean typeCheck5 = button instanceof ToggleButton; // 부모 instanceof 자식 = false

        //! 에러
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton; // 형제 instanceof 형제 = Error
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton; // 형제 instanceof 형제 = Error

        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }
    }
}
