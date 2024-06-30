package sec05.chap05.ex01;

public class YalcoChicken {
    // protected!?
    protected int no;
//    private int no; //! private이면 Main에서 에러!
    protected String name;

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder() {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
