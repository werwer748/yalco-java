package sec05.chap02.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class YalcoChicken {
    int no;
    String name;
    ChickenMenu[] menus;

    YalcoChicken (int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    void addMenus(ChickenMenu newMenu) {
        ArrayList<ChickenMenu> newMenusList = new ArrayList<>();

        for (ChickenMenu menu : menus) {
            if (menu.name.equals(newMenu.name)) { // 같은 이름 메뉴있으면 로직 종료!
                return;
            }
            newMenusList.add(menu);
        }

        newMenusList.add(newMenu);
        ChickenMenu[] newMenusArray = new ChickenMenu[newMenusList.size()];
        newMenusArray = newMenusList.toArray(newMenusArray);
        this.menus = newMenusArray;
    }

    ChickenMenu orderMenu (String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) { // 🔴
                return menu;
            }
        }
        return null;
    }
}
