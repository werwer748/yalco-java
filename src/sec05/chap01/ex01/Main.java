package sec05.chap01.ex01;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1, "DARK");
        Button button2 = new Button('2', 1, "DARK");
        Button button3 = new Button('3', 1, "DARK");
        Button button4 = new Button('4', 1, "DARK");
        Button button5 = new Button('5', 1, "DARK");
        Button button6 = new Button('6', 1, "DARK");
        Button button7 = new Button('7', 1, "DARK");
        Button button8 = new Button('8', 1, "DARK");
        Button button9 = new Button('9', 1, "DARK");
        Button button0 = new Button('0', 2, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonClear = new Button('C', 2, "DARK");

        button1.place();
        button2.place();
        button3.place();
        button4.place();
        button5.place();
        button6.place();
        button7.place();
        button8.place();
        button9.place();
        button0.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
