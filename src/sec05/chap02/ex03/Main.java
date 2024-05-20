package sec05.chap02.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000), // cook은 기본값 "fry"
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake")
        };
        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐구이");

        // 원시값은 값을 복사한다.
        int int1 = 1;
        int int2 = int1;
        int1 = 2;

        String str1 = "헬로";
        String str2 = str1;
        str2 = "월드";

        // 객체는 참조복사(주소를 복사)
        ChickenMenu menu1 = new ChickenMenu("후라이드", 1000);
        ChickenMenu menu2 = menu1;
        menu1.price = 1200;

        int avgChickenPrice = 12000;
        ChickenMenu chickenMenu1 = new ChickenMenu("양념치킨", 12000);
        ChickenMenu chickenMenu2 = new ChickenMenu("오븐구이", 12000, "bake");

        store1.addMenus(chickenMenu1);
        store1.addMenus(chickenMenu2);

        raisePrice(avgChickenPrice, chickenMenu1, 1000);
    }

    public static void raisePrice (int avg, ChickenMenu menu, int amount) {
        avg += amount; // 다시 한번 원본이 바뀌는게 아니고 값을 복사해옴
        menu.price += amount; // 객체 주소를 가져오기 때문에 참조된 객체 내부 값이 바뀜
    }
}
