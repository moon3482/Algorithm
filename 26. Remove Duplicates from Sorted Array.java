class Solution {
    public int removeDuplicates(int[] nums) {
  if(nums.length>0){
        ArrayList a = new ArrayList<Integer>();
        a.add(nums[0]);
        for(int i = 0; i<nums.length-1; i++){
          if(nums[i]!=nums[i+1]){
                    a.add(nums[i+1]);
                   
                    
                }
               
            
        }
        for(int j = 0; j<a.size(); j++){
            nums[j] = (int)a.get(j);
        }
        nums = new int [a.size()];
        return nums.length;}else{
      return nums.length;
  }
    }
}
