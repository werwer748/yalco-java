package sec04.chap07;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //? Scanner : 키보드 입력이나 파일 등로부터 텍스트 값을 받아오기 위한 클래스
        //? System.in : InputStream 의 인스턴스, 입력받은 값들의 흐름
        Scanner sc = new Scanner(System.in);

        //? `next` : 스페이스를 비롯한 공백 단위로 끊어서 *(토큰으로)* 문자열을 받음
        //? `nextLine` : 줄바꿈 단위로 끊어서 문자열을 받음
//        String str1 = sc.next(); // 진행을 멈추고 사용자의 입력을 기다림
//        String str2 = sc.next();
        String str3 = sc.nextLine(); // next 보다는 nextline만 있을 때 생각한 대로 찍히긴함.
        String str4 = sc.nextLine();

//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}
