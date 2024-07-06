package sec05.chap06.ex03;

import sec05.chap01.ex03.YalcoChicken;
import sec05.chap05.ex02.Button;
import sec05.chap05.ex02.ShutDownButton;
import sec05.chap05.ex03.FireSlime;

//* Object  클래스 - 모든 클래스의 최고 조상
public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();

        //  ⭐️ IDE의 안내대로 다른 패키지의 클래스 임포트
        //  💡 해당 클래스의 생성자가 public 이어야 함
        Object obj2 = new YalcoChicken(3, "판교");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime(30);

        //  원시 자료형들도 Object의 인스턴스로
        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";
        Object obj8 = null;
        Object obj9 = new Error("asd");

        //  ⭐️ 모든 자료형을 포함할 수 있는 배열
        Object[] objs = {
                1, false, 3.45, '가', "안녕하세요", new Button("Space")
        };

        for (Object obj : objs) {
            // 전부 잘 출력 됨
            System.out.println(obj);
        }
    }
}
