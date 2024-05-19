package sec05.chap01.ex03;

public class YalcoChicken {
    int no;
    String name;

    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴
    /*
    ### ⭐️ `this`  - 만들어질 인스턴스를 가리킴

        - `intro` 메소드 브레이크포인트에서 `this` 항목 확인
            - `no` 와 `name` 에 `this` 를 붙인 것과 같음
        - 메소드 내에서 같은 이름의 변수나 인자가 없다면 식별자는 `this` 의 필드를 가리킴
        - 같은 이름의 변수나 인자가 있다면 덮어씌워짐
    */
    public YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro () {
          String name = "몽고반"; // 주석해제 시 name 대체
//        YalcoChicken yalcoChicken = this;
        return "안녕하세요, %d호 %s점입니다." // 🔴
                .formatted(no, this.name);
    }
}
