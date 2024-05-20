package sec05.chap02.ex01;

public class Main {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        // ⭐️ 객체는 참조형 - 인자로 전달될 시 내용이 변경될 수 있음
        // 같은 클래스의 인스턴스지만, 필드의 값은 각기 별개임 주목
        slime1.attack(slime2);
    }
}
