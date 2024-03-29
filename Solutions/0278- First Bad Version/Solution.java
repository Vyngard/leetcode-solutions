/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
    
            while (left < right) {
                int middle = (left + right) >>> 1;
            
                if (!isBadVersion(middle))
                    left = middle + 1;
                else {
                    right = middle;
                }
                    
            }
    
            return left;
        }
    }