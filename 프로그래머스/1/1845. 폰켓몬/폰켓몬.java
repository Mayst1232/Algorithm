import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : nums) {
            hashSet.add(i);
        }

        return Math.min(hashSet.size(), max);
    }
}