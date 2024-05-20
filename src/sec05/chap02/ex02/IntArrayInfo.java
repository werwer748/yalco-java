package sec05.chap02.ex02;

public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num; // 일부러 여기 없앴을때 sum은 그냥 num
        }

        average = 1.0 * sum / nums.length; //count를 사용해도 생각한 대로 작동
    }
}
