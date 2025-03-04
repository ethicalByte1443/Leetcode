class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part) >= 0){
            sb.delete(sb.indexOf(part), sb.indexOf(part) + part.length());
        }
        return sb.toString();
    }
}