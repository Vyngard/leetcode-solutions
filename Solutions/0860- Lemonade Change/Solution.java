class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCounter = 0;
        int tenCounter = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCounter++;
            }
            else if (bill == 10) {
                if (fiveCounter > 0) {
                    fiveCounter--;
                    tenCounter++;
                } else {
                    return false;
                }
            } else {
                if (tenCounter > 0 && fiveCounter > 0) {
                    tenCounter--;
                    fiveCounter--;
                } else if (fiveCounter >= 3) {
                    fiveCounter -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
        
    }
}