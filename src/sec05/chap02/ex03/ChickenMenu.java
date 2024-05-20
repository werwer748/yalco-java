package sec05.chap02.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    ChickenMenu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 오버로딩!
    ChickenMenu (String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}
