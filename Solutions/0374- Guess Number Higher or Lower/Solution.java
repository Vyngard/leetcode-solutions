/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int middle = (left + right) >>> 1;
            int myGuess = guess(middle);
            if (myGuess == -1) {
                right = middle;
            } else if (myGuess == 1) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return left;
    }
}