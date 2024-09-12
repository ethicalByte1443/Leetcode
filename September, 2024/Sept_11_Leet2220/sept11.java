package Sept_11_Leet2220;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sept11{
    public List<Integer> toBit(int num) {
        List<Integer> bitList = new ArrayList<>();
        while (num != 0) {
            bitList.add(num % 2);
            num = num / 2;
        }
        Collections.reverse(bitList);
        return bitList;
    }

    public int minBitFlips(int start, int goal) {
        List<Integer> num1 = toBit(start);
        List<Integer> num2 = toBit(goal);

        int length1 = num1.size();
        int length2 = num2.size();
        if (length1 > length2) {
            for (int i = 0; i < length1 - length2; i++) {
                num2.add(0, 0);
            }
        } else if (length1 < length2) {
            for (int i = 0; i < length2 - length1; i++) {
                num1.add(0, 0);
            }
        }

        int count = 0;
        for (int i = 0; i < num1.size(); i++) {
            if (!num1.get(i).equals(num2.get(i))) {
                count++;
            }
        }

        return count;
    }
}