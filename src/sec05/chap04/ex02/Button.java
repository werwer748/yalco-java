package sec05.chap04.ex02;

/**
 * 필드들에는 private
 * 메소드들에 public
 * 일반적으로 이런식으로 많이 쓴다고 함..
  */
public class Button {
    //? 클래스에 필드나 메서드에도 접근제어자를 사용할 수 있다.
    //* private으로 접근을 제한함으로써 해당 필드의 값에 엉뚱한 값이 들어가는걸 방지
    private static String mode = "LIGHT";

    //* private으로 접근을 제한한 필드는 오로지 이 메서드를 통해서만 컨트롤 되도록 한다.
    public static void switchMode () {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }
    public static String printMode () {
        return mode;
    }

    private char print;
    private int space;

    public Button (char print, int space) {
        this.print = print;
        this.space = space;
    }

    public void setSpace (int space) {
        if (space < 1 || space > 4) return;
        this.space = space;
    }
    public String getButtonInfo () {
        return "%c 버튼, %d픽셀 차지, %s"
                .formatted(print, space * 4096, mode);
    }
}
