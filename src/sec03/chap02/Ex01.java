package sec03.chap02;

import java.math.BigDecimal;

public class Ex01 {
    public static void main(String[] args) {

        // double : float 보다 단순히 범위가 넓은 것이 아니라, 보다 정밀하게 표현 가능
        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b;

        boolean bool = 0.1 + 0.2 == 0.3;

        String stringToA = String.valueOf(a);
        String stringToB = String.valueOf(b);

        BigDecimal aa = new BigDecimal("2.01");
        BigDecimal bb = new BigDecimal("2.01");
        BigDecimal cc = new BigDecimal("2.010");
        BigDecimal dd = new BigDecimal("2.000");

        // 객체의 레퍼런스 주소에 대한 비교 연산자
        // false
        System.out.println("(a == b) = " + (aa == bb));

        // 값의 비교를 위해 사용, 소수점 맨 끝의 0까지 완전히 값이 동일해야 true 반환
        // true
        System.out.println("a.equals(b) = " + aa.equals(bb));
        // false
        System.out.println("a.equals(c) = " + aa.equals(cc));

        // 값의 비교를 위해 사용, 소수점 맨 끝의 0을 무시하고 값이 동일하면 0, 적으면 -1, 많으면 1을 반환
        // 0
        System.out.println("a.compareTo(c) = " + aa.compareTo(cc));
        // 1
        System.out.println("a.compareTo(d) = " + aa.compareTo(dd));

        double point1 = 0.1, point2 = 0.2;

        BigDecimal point1ToDecimal = new BigDecimal(String.valueOf(point1));
        BigDecimal point2ToDecimal = new BigDecimal(String.valueOf(point2));

        BigDecimal plusPoint1AndPoint2 = point1ToDecimal.add(point2ToDecimal);
        BigDecimal subtractPoint1AndPoint2 = point1ToDecimal.subtract(point2ToDecimal);
        BigDecimal multiplyPoint1AndPoint2 = point1ToDecimal.multiply(point2ToDecimal);
        BigDecimal dividePoint1AndPoint2 = point1ToDecimal.divide(point2ToDecimal);

        double dou1 = 0.1, dou2 = 0.2;
        double floor = Math.floor((dou1 + dou2) * 100) / 100.0;
    }
}
