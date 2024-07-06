package sec05.chap07;

//* final로 선언된 클래스는 자식을 가질 수 없다...ㅠㅡㅜ
public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

//    @Override // final로 선언된 메서드기 때문에 오버라이드를 막는다.
    public void fryChicken(String abc) {
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
        System.out.println("염지, 반죽입히기, 튀김" + abc);
    }

    // 생성자 추가?
}
