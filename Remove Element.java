class Solution {
    public int removeElement(int[] nums, int val) {
        int a = nums.length;
        int num = 0;
        int m = 0;
        for(int i = 0; i<nums.length; i++){
            if(val!=nums[i]){
                nums[num]=nums[i];
                num++;
            }else{
                m++;
            }
        }
        nums = new int[a-m];
        return nums.length;
    }
}
