class Solution {
    public int minLength(String s) {
        // StringBuilder sb = new StringBuilder(s);
        while(s.contains("AB") || s.contains("CD")){
            if(s.contains("AB")){
                s=s.replace("AB", "");
            }
            if(s.contains("CD")){
                s=s.replace("CD", "");
            }
        }
        return s.length();
    }
}