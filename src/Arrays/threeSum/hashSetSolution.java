package Arrays.threeSum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            Set<Integer> visited = new HashSet();
            for(int j = i + 1; j < n; j++){
                int val = -(nums[i] + nums[j]);
                if(visited.contains(val)){
                    List<Integer> res = new ArrayList(Arrays.asList(nums[i], nums[j], val));
                    Collections.sort(res);
                    resultSet.add(res);
                } else {
                    visited.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
