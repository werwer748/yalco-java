package sec05.chap04.ex02;

import sec05.chap04.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {

        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

    //    String pb = smartPhone.powerButton; // ⚠️ 불가 => default(다른 패키지)
        String ss = smartPhone.sdCardSlot;

        Button button1 = new Button('1', 1);
        Button buttonPlus = new Button('+', 100);

//        Button.mode = "OCEAN"; // ⚠️ 불가: private으로 선언하고 메서드(퍼블릭으로 선언)로만 컨트롤함
        //* mode는 바뀌면 모든 new Button으로 생성된 클래스의 mode값이 바뀐다.
        Button.switchMode();

//        button1.space = 3; // ⚠️ 불가
        button1.setSpace(3);
        button1.setSpace(-1); // 걸러짐

//        char button1Print = button1.print; // ⚠️ 불가
        String button1Info = button1.getButtonInfo();
        String buttonPlusInfo = buttonPlus.getButtonInfo();

    }
}
