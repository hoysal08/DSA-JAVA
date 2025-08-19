package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

class twoSumSolution {
    static public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        Map<Integer, Integer> diffLookup = new HashMap();
        while (i < n) {
            if (diffLookup.get(nums[i]) != null) {
                return new int[]{diffLookup.get(nums[i]), i};
            } else if (diffLookup.get(target - nums[i]) == null) {
                out.println(Integer.toString(target - nums[i]) + "," + Integer.toString(i));
                diffLookup.put(target - nums[i], i);
            } else if (diffLookup.get(nums[i])!= null && target == nums[i] + nums[diffLookup.get(nums[i])]) {
                return new int[]{diffLookup.get(target - nums[i]), i};
            }
            i++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1};
        int target = 11;
        out.println(Arrays.toString(twoSum(nums, target)));
    }
}
