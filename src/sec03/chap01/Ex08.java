package sec03.chap01;

public class Ex08 {
    public static void main(String[] args) {
        /**
         * 연산자      반환값     부수효과
         * +        값 그대로     없음
         * -        양음 반전     없음
         * x++      값그대로      1 증가
         * ++x      1증가한 값    1 증가
         * x--      값 그대로     1 감소
         * --x      1 감소한 값   1 감소
         */

        int int1 = 3;
        // 단항연산자는 ; 넘어가면 바뀐값이 넘어가겠지만 계산 당시 위치에 따라 어떻게 해석하느냐의 차이가 있다.
        int int2 = int1++; // 🔴
        int int3 = ++int1;
        int int4 = -(int2-- * --int3);

        int x = 1;

        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);

        //  ⚠️ 리터럴에는 사용 불가 => 무조건 담아서 써야함.
//        int int5 = 3++;
//        int int6 = --3;
    }
}
