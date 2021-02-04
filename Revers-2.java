class Solution {
    public int reverse(int x) {
        long k = (long)x;
        if(k<0){
            k = k*-1;}
        else if (k>0){
            k = k;
        }else{
            k = 0;
        }
        if(k!=0){
        String[] a = String.valueOf(k).split("");
        String b="";
        for(int i = a.length-1; i>=0; i--){
                b = b +a[i];
            }
            if(Long.parseLong(b)>Integer.MAX_VALUE||Long.parseLong(b)<Integer.MIN_VALUE){
            return 0;    
            }else{
                if(x<0){
                b="-"+b;
                return Integer.parseInt(b);}
                else{
                    return Integer.parseInt(b);
                }
            }}else{
            return 0;
        }
            
      
        
        
        
    }
}
