package Arrays.threeSum;

import java.util.*;


//TLE
//brute force
//Time: O(N * N * N * log3); Space: O(N)
class bruteForceSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(list);
                        resultSet.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
