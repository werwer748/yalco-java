package sec05.chap03.ex01;

public class YalcoChicken {
    // * 클래스/정적 필드와 메소드들 : 본사의 정보와 기능 - 대리점에서 본사 기능 쓸려고하면 친절하게 알려주지는 않네
    // 인스턴스마다 따로 갖고 있을 필요가 없는 것들에 사용
    static String brand = "얄코치킨";

    static String contact() {
        //! 정적 메소드에서는 인스턴스 프로퍼티 사용 불가
//        System.out.println(name);

        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

//    static String isNull; // 프리미티브 타입인데 초기값 없으면 에러

    String name;
    int no;

    public YalcoChicken(int no, String name, String brand) {
        this.no = no;
        this.name = name;
        this.brand = brand;
    }

    public YalcoChicken(int no, String name) {
        this.name = name;
        this.no = no;
    }

    String intro() {
        // * 인스턴스 메소드에서는 정적 프로퍼티 사용 가능
        return "안녕하세요, %s %d호 %s호점 입니다.".formatted(brand, no, name);
    }
}
