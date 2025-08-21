package Arrays;

public class moveZeroSolution {
    public void moveZeroes(int[] nums) {
        int ins = 0;
        int ser = 0;
        int n = nums.length;

        while(ser < n) {
            if(nums[ser] !=0 ){
                nums[ins++] = nums[ser++];
            } else if(nums[ser] == 0) {
                ser++;
            }
        }

        while(ins < n) {
            nums[ins++] = 0;
        }
    }
}
