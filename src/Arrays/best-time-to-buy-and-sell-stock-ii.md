## Product of Array Except Self
[Leetcode](https://leetcode.com/problems/product-of-array-except-self/description/)

### 1. Brute Force
#### Time Complexity: O(n)
#### Space Complexity: O(1)
```java
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length;i++) {
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}
```