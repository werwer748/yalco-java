package sec04.chap07;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();
        // 🧪 Servlet으로 파라미터가져올떄같음

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);
    }
}
