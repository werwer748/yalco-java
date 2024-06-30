package sec05.chap05.ex02;

/**
 * ### 메소드 오버라이딩
 *
 * - 부모가 가진 같은 이름의 메소드를 자식이 다르게 정의
 *     - *‘저는 제 방식대로 하겠습니다.’*
 * - 오버로딩과 혼동하지 말 것
 *     - 오버로딩은 인자가 다른 같은 이름의 메소드를 여러개 만들 수 있는거~~
 *
 * - 상속은 여러번 이어서 내려갈 수 있다.
 */

public class ShutDownButton extends Button {

    public ShutDownButton() {
        //* 생성자에서 사용된 super는 부모의 생성자를 가리킨다.
        super("ShutDown"); // 💡 부모의 생성자 호출 => Button("ShutDown") 한 것과 같다.
    }

    //  💡 부모의 메소드를 override
    @Override //? 부모의 특정 메소드를 오버라이드헀음을 명시해 준것. (안붙여도 에러가 나지는 않음)
    public void func() {
        System.out.println("프로그램 종료");
    }
}
