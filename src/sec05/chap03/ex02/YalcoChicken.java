package sec05.chap03.ex02;

public class YalcoChicken {

    static String brand = "얄코치킨";
    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }
    static int lastNo = 0; // 메모리에 올라와 있으니까...?

    int no;
    String name;

    YalcoChicken(String name) {
        // static을 활용해서 번호를 ++
        no = ++lastNo;
        this.name = name;
    }

    String intro() {
        return "안녕하세요, %s %d호 %s호점 입니다.".formatted(brand, no, name);
    }
}
