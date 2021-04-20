class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        int kk = 0;
        for(int i = 0; i<nums.length; i++){
            num = 0;
            int k = nums[i];
            for(int j = 0; j<nums.length; j++){
                int l = nums[j];
                if(k == l){
                    num++;
                }
            }
            if(num == 1 ){
                kk = k;
            }
        }
            
        
        return kk;
    }
}
