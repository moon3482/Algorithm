class Solution {
    public boolean isPalindrome(int x) {
        if(0>x){
            return false;              
        }else{
           try{
            String revers = new StringBuilder(String.valueOf(x)).reverse().toString();
            if(Integer.parseInt(revers) == x){
                return true;
            }else{
                return false;
            }
           }catch(NumberFormatException e){
               return false;
           }
        }
        
    }
}
