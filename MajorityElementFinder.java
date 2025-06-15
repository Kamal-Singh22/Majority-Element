import java.util.*;

public class MajorityElementFinder {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 3, 2, 2};
        int majority = findMajorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
