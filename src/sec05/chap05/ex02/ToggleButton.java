package sec05.chap05.ex02;

public class ToggleButton extends Button {

    private boolean on;

    public ToggleButton(String print, boolean on) {
        super(print);
        this.on = on;
    }

    @Override
    public void func() {
        super.func();  // 💡 부모에서 정의한 메소드 호출
        this.on = !this.on;
        System.out.println(
                //* 부모의 private필드를 getter를 통해 가져오기 (super, this 모두 가능)
//                this.getPrint() + ": " + (this.on ? "ON" : "OFF")
                super.getPrint() + ": " + (this.on ? "ON" : "OFF")
        );
    }
}
