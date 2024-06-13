package sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);
        Button buttonPlus = new Button('+', 3);
        Button buttonClear = new Button('C', 2);

        Button[] buttons = {button1, buttonPlus, buttonClear};

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        //  연속으로 붙여넣어 실행해볼 것
        Button.switchMode(); // LIGHT => DARK

        // 여기부터 모든 버튼은 다크모드 => 정적 필드값이 바뀐다고 이전에 생성한 인스턴스들내부도 바뀌는건 아닌듯
        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        Button.switchMode(); // DARK => LIGHT

        // 여기부터 모든 버튼은 다크모드 => 정적 필드값이 바뀐다고 이전에 생성한 인스턴스들내부도 바뀌는건 아닌듯
        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        Button.switchMode(); // LIGHT => DARK

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }
    }
}
