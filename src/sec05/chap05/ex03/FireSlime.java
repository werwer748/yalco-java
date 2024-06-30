package sec05.chap05.ex03;


public class FireSlime extends Slime {
    private int fireAttack = 4;

    //? 부모클래스에 생성자가 없어서 자식 클래스에서도 따로 작성할 필요 없음
    public FireSlime(Integer fireAttack) {
        if (fireAttack == null) return;
        this.fireAttack = fireAttack;
    }

    @Override
    public void attack(Slime enemy) {
        enemy.hp -= (attack + fireAttack) * (1 - enemy.defense);
    }
}
