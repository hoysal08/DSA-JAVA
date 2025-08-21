package Arrays;

public class maxConsecutive3 {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int e = 0;
        int res = 0;
        int zeroC = 0;
        while(e < n){
            if(nums[e] == 0) {
                zeroC++;
            }

            while(zeroC > k) {
                if(nums[s] == 0){
                    zeroC--;
                }
                s++;
            }

            e++;
            res = Math.max(res, e-s);
        }
        return res;
    }

}
