import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        String res = "";
        try{
            Callable<String> task = () -> generateLCS(str1, str2);
            FutureTask<String> future = new FutureTask<>(task);
            new Thread(future).start();
            res = future.get();
        }
        catch(Exception e){

        }
        return res;
    }
    public String generateLCS(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int[][] lcsMatrix = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    lcsMatrix[i][j] = lcsMatrix[i - 1][j - 1] + 1;
                }
                else{
                    lcsMatrix[i][j] = Math.max(lcsMatrix[i - 1][j], lcsMatrix[i][j - 1]);
                }
            }
        }
        int row = m, col = n;
        StringBuilder ans = new StringBuilder();
        while(row > 0 && col > 0){
            if(str1.charAt(row - 1) == str2.charAt(col - 1)){
                ans.append(str1.charAt(row - 1));
                row--;
                col--;
            }
            else if(lcsMatrix[row - 1][col] > lcsMatrix[row][col - 1]){
                ans.append(str1.charAt(row - 1));
                row--;
            }
            else{
                ans.append(str2.charAt(col - 1));
                col--;
            }
        }
        while(row > 0){
            ans.append(str1.charAt(row - 1));
            row--;
        }
        while(col > 0){
            ans.append(str2.charAt(col - 1));
            col--;
        }
        return ans.reverse().toString();
    }
}