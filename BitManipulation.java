public class BitManipulation {
    static class Solution {
 public int longestConsecutiveOnes(int n) {
 int max = 0;
 int count = 0;
 while (n > 0) {
 if ((n & 1) == 1) {
 count++;
 max = Math.max(max, count);
 } else {
 count = 0;
 }
 n >>= 1;
 }
 return max;
 }
 public static void main(String[] args) {
 Solution s = new Solution();
 System.out.println(s.longestConsecutiveOnes(156)); // 3
 }
}
}
