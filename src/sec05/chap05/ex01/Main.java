package sec05.chap05.ex01;

public class Main {
    public static void main(String[] args) {

        YalcoChicken store1 = new YalcoChicken(1, "진주");
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");
        YalcoChickenDT dtStore2 = new YalcoChickenDT(100, "홍천");

        store1.no = 2; //! protected기 때문에 바꿀 수 있음
        dtStore2.takeHallOrder();
//        dtStore2.driveThruOpen = false; //! private!!!
        dtStore2.no = 99; //! protected기 때문에 바꿀 수 있음

        store1.takeHallOrder();
        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        dtStore2.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
        dtStore2.takeDTOrder();

    }
}
