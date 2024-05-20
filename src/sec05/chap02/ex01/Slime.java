package sec05.chap02.ex01;

public class Slime {
    // 플드들이 기본값을 가지기 때문에 생성자가 필요하지 않음
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    void attack(Slime enemy) { // 💡 다른 슬라임의 인스턴스를 인자로 받음
        enemy.hp -= this.attack * (1 - enemy.defense);
    }

}
