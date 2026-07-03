class Solution {
    public boolean isAnagram(String s, String t) {
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        if(sarr.length == tarr.length){
            Arrays.sort(sarr);
            Arrays.sort(tarr);
            int i = 0;
            while(i < sarr.length){
                if(sarr[i] == tarr[i]){
                    i++;
                } else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}