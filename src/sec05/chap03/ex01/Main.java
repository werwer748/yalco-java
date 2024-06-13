package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        //? 클래스 필드와 메소드는 인스턴스를 생성하지 않고 사용
        String ycBrand = YalcoChicken.brand; // static String brand
        String ycContact = YalcoChicken.contact(); // static String contact() {}
//        String ycIsNull = YalcoChicken.isNull;

        //! 인스턴스 메소드는 불가 - 안꺼내져!!!
//        String ycName = YalcoChicken.name; // String name; => public 붙여도 안됨
//        String ycIntro = YalcoChicken.intro(); // Non-static method 'intro()' cannot be referenced from a static context

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String store1Intro = store1.intro(); // 이제는 사용가능!

        // 인스턴스에서는 클래스의 필드와 메소드 사용 가능
        //! 편의상 기능일 뿐 권장되지 않는다...? => 문제가있다기보다는 좋은 컨벤션이 아니라 막는느낌...?
        String store1Brand = store1.brand; // .b 찍으면 나와야 되는데 안나옴!
        String store1Contact = store1.contact(); // Static member 'sec05.chap03.ex01.YalcoChicken.contact()' accessed via instance reference
    }
}
