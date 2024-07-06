package sec05.chap06.ex02;

/**
 * YalcoChicken을 상속받아 드라이브 스루 기능이 있는 클래스를 만든다.
 *
 * 기존 얄코치킨 클래스의 모든 필드와 메소드 포함
 * extends 연산자 사용
 */
public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder() {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
