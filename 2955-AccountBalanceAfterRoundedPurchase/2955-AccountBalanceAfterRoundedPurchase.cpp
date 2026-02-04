// Last updated: 2/4/2026, 9:25:50 PM
class Solution {
public:
    int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = ((purchaseAmount+5)/10)*10;
        return 100-roundedAmount;
    }
};