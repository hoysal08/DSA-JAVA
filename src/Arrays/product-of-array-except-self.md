## Product of Array Except Self
[Leetcode](https://leetcode.com/problems/product-of-array-except-self/description/)

### 1. Brute Force
### iterate array twice in nested for loop
#### Time Complexity: O(n^2)
#### Space Complexity: O(1)
```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for( int i = 0; i < n; i++){
            int product = 1;
            for ( int j = 0; j < n;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }
}
```

### Prefix and Suffix Products
### Maintain prefix and suffix array, mulply finally to get answer array
#### Time Complexity: O(n)
#### Space Complexity: O(n)
```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
}
```

### Optimized with Single Pass
### to calculate the prefix, update the answer array and for the suffix maintain a variable and multiple that with current number always
#### Space Complexity: O(1)
#### Time Complexity: O(n)
```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1; i < n ; i++){
            answer[i] = answer[i-1] * nums[i - 1];
        }

        int right = 1;
        for(int i = n - 1; i >= 0 ; i--){
            answer[i] *=right;
            right *= nums[i];
        }
        
        return answer;
    }
}

```