package sec05.chap04.ex01;

/**
 * 클래스의 특정 요소를 감추는 이유
 *
 * - ‘감추는’ 것이 아님 - 코드로 확인 가능
 *     - 라이브러리 예시 확인
 *     - 폰도 부숴서 확인할 수 있듯이…
 * - 작성자의 의도대로 사용하도록 하기 위함
 *     - 쓰라고 의도한 기능만 공개(IDE의 자동완성 등)하여 혼란 방지
 *         - 내부적으로 수많은 필드들이 사용된다면?
 *         - 제한이 오히려 편의를 제공
 *     - 필드에 부적절한 값이 적용되는 등의 오용 방지
 *     - 다른 클래스와 복합적으로 사용될 경우 혼선 방지
 *         - 스마트폰 - PC 연결은 USB 케이블로만…
 * - 기타 다양한 이유
 */

public class Main {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가 => private으로 선언됨

    }
}
