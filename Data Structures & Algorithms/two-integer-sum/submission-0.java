class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> iv = new HashMap<>();
        for(int i =0 ; i < nums.length;i++){
            iv.put(nums[i],i);
        }
        for(int i =0 ; i < nums.length; i++){
        int dif = target - nums[i];
        if(iv.containsKey(dif) && iv.get(dif) != i) return new int[]{i,iv.get(dif)};

        }
        return new int[0];
    }
}
