class Solution {
    public String clearDigits(String s) {
        // StringBuilder sb = new StringBuilder(s);
        StringBuilder sb = new StringBuilder(s);
        System.err.println(sb);
        Set<Character> ch = new HashSet<>();
        ch.add('1');
        ch.add('2');
        ch.add('3');
        ch.add('4');
        ch.add('5');
        ch.add('6');
        ch.add('7');
        ch.add('8');
        ch.add('9');
        ch.add('0');
        int i = 0;
        while(i < sb.length()){
            if(ch.contains(sb.charAt(i))){
                if(i-1 < 0){
                    sb.deleteCharAt(i);
                }
                else{
                    sb.deleteCharAt(i-1);
                    sb.deleteCharAt(i-1);
                    i--;
                }
            }
            else{
                i++;
            }
        }

        return sb.toString();
    }
}