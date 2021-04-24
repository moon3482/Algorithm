class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = {0,0};
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = 1; j<numbers.length; j++){
                if((numbers[i]+numbers[j])==target&& i!=j){
                    answer[0] = i+1;
                    answer[1] = j+1;
                      return answer;  
                }
            }
        }
      return answer;
    }
}
