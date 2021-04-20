class Solution {
    public int searchInsert(int[] nums, int target) {
         Integer[] aa = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        int a = Arrays.binarySearch(aa,target);
     if(a<0){
        a = Math.abs(a)-1;
     }
      
        return a;
    }
}
