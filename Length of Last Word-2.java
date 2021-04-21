  public int lengthOfLastWord(String s) {
   
        String[] m = s.split(" ");
        if(m.length==0){
            return 0;
        }
        int k = m[m.length-1].length();
        return k;
    }
