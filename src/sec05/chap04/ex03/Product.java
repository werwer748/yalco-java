package sec05.chap04.ex03;

/**
 * Getter Setter?
 *
 * Java 언어의 기능이라기보다는
 * 객체지향 기능을 갖춘 언어들에서 많이 사용하는 코딩 스타일!!
 */
public class Product {

    // 전체적인 상품에 적용되어야할 값(할인율, 가격 상한선...)
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) return; // 빈값을 받지 않게끔
        this.name = name;
    }

    public int getPrice() {
        return (int) (price * (1 - discount)); // 할인율을 적용하여 리턴
    }

    public void setPrice(int price) {
        //  ⭐ this 사용 주의
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }

}
