public class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        for(int num: nums){
            int current = num;
            int streak = 1;

            while(contains(nums, current+1)){
                current++;
                streak++;
            }

            longest = Math.max(longest, streak);
        }

        return longest;
    }

    public boolean contains(int[] nums, int target){
        for(int n: nums)
            if(n==target)
                return true;
            
        

        return false;
    }
}