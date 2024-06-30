package sec05.chap04.ex01;

/**
 * 접근제어자 정리
 *         해당 클래스 내  | 동일 패키지 내 | 동일패키지 또는 자손 클래스 내   | 다른 패키지 포함 어느 곳이든
 * public:      O       |      O     |              O            |          O
 * protected:   O       |      O     |              O            |          X
 * default:     O       |      O     |              X            |          X
 * private:     O       |      X     |              X            |          X
 */

public class SmartPhone {
    //? 따로 명시하지않을 경우 default라는 접근 제어자를 가진다.
    String powerButton = "OnOff";
    public String sdCardSlot = "SD Card";

    //* 밖에서 꺼내쓰지못하게 뚜껑을 씌워둠
    private String cpu = "Yalcom";
}
