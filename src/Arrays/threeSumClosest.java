package Arrays;
import java.util.*;

public class threeSumClosest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int closeSum = nums[0] + nums[1] + nums[2];
        while( i < n){
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int currDelta = target - sum;
                if(Math.abs(target - closeSum) > Math.abs(currDelta)){
                    closeSum = sum;
                }

                if(currDelta > 0) {
                    j++;
                } else if (currDelta < 0) {
                    k--;
                } else {
                    return sum;
                }
            }
            i++;
        }
        return closeSum;
    }
}
