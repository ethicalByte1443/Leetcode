package Sept_12_Leet1684;
import java.util.Set;
import java.util.HashSet;
public class sept12 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowed_set = new HashSet<>();

        for(char c: allowed.toCharArray()){
            allowed_set.add(c);
        }
        int count = 0;
        for(String word : words){
            boolean flag = false;
            for(char i: word.toCharArray()){
                if(allowed_set.contains(i)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

        return count;
    }
}
