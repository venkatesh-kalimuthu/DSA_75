class Solution {
    public boolean isSubsequence(String s, String t) {

        int pointerS = 0;
        int pointerT = 0;

        while (pointerS < s.length() && pointerT < t.length()){

            if(s.charAt(pointerS) == t.charAt(pointerT)){
                pointerS++;
            }
            pointerT++;
        }

        return pointerS == s.length();
        
    }
}
