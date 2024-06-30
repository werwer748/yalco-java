package sec05.chap05.ex03;

public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime(10);

        slime.attack(fireSlime); // ⭐ 클래스가 다른데 가능한 이유 : fireSlime이 Slime을 상속 받았으니까...?
        fireSlime.attack(slime);

    }
}
