class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] m = s.split(" ");
        int k = m[m.length-1].length();
        return k;
    }
}
