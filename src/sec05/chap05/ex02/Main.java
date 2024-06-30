package sec05.chap05.ex02;

public class Main {
    public static void main(String[] args) {

        Button entrButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);
        ToggleButton tglLangButton = new ToggleButton("한/영", false);

        entrButton.func();

        System.out.println("\n- - - - -\n");

        stdnButton.func();

        System.out.println("\n- - - - -\n");

        tglButton.func();
        tglLangButton.func();

        tglButton.func();
        tglLangButton.func();

        tglButton.func();

    }
}
