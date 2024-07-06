package sec05.chap07;

public class YalcoChicken {
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no; // = 1; //! 생성자에서 값을 주지 않으면 초기값이 없어서 에러
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no; // no를 선언시에 초기화하면 생성자에서 초기화시 에러
        this.name = name;
    }

    public void changeFinalFields() {
//        this.no ++; // final로 선언됐기 때문에 값을 바꿀 수 없다
    }

    public final void fryChicken() {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
