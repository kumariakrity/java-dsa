/*
LeetCode: 121
Title: Best Time to Buy and Sell Stock

Pattern:
Running Minimum

Approach:

1. Keep track of the minimum stock price seen so far.
2. For each day, calculate the profit if we sell on that day.
3. Update the maximum profit whenever a better profit is found.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
While traversing the array, maintain:

* Minimum buying price seen so far
* Maximum profit seen so far

This avoids checking every buy/sell pair.
*/
/*
public int maxProfit(int[] prices) {

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {

        buyPrice = Math.min(buyPrice, price);
        maxProfit = Math.max(maxProfit, price - buyPrice);
    }

    return maxProfit;
}
*/

public class LC121_BestTimeToBuyAndSellStock {

```
public int maxProfit(int[] prices) {

    int maxProfit = 0;
    int buyPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {

        if (prices[i] < buyPrice) {
            buyPrice = prices[i];
        }

        maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
    }

    return maxProfit;
}

public static void main(String[] args) {

    LC121_BestTimeToBuyAndSellStock solution =
            new LC121_BestTimeToBuyAndSellStock();

    int[] prices = {7, 1, 5, 3, 6, 4};

    System.out.println(solution.maxProfit(prices));
}
```

}
