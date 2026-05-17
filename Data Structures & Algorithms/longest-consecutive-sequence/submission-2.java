public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        int longest = 0;
        
        for(int num: nums){
            store.add(num);
        }

        for(int num: nums){
            int current = num;
            int streak = 0;

            while(store.contains(current)){
                current++;
                streak++;
            }

            longest = Math.max(longest, streak);
        }

        return longest;
    }

}