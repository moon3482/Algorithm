class Solution {
    public int reverse(int x) {
        
        if(x>0){
             String c = String.valueOf(x);
        char[] a = c.toCharArray();
        String ba = "";
       if(a[a.length-1]!=0){
            for(int i = a.length-1; i>=0; i--){
           
        ba = ba+a[i];
            
        
        }
          if(Long.parseLong(ba)<=Integer.MAX_VALUE){
         
            return Integer.parseInt(ba);
          }
         else{
              return 0;
          }
       }else{
           
       
           
            for(int i = a.length-2; i>=0; i--){
           
        ba = ba+a[i];
              
       }
           
           ba = ba.substring(1);
            int d = Integer.parseInt(ba);
            return d;
        }}else if(x==0){
       
            return 0;
        }else{
            String c = String.valueOf(x);
            String[] sp = c.split("-"); 
        char[] a = sp[1].toCharArray();
        String ba = "";
            for(int i = a.length-1; i>=0; i--){
         
                ba = ba+a[i];
        
        }
            ba= "-"+ba;
            if(Long.parseLong(ba)>=Integer.MIN_VALUE){
         
            return Integer.parseInt(ba);
          }
         else{
              return 0;
          }
            
        }
        
    
    }
}
