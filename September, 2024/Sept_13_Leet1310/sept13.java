class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] mace = new int[queries.length];
        for(int i = 1;i<arr.length;i++){
            arr[i] = arr[i-1] ^ arr[i];
        }
        int i=0;
        for(int sub[] : queries){
            int left = sub[0];
            int right = sub[1];
            if(left != 0){
                mace[i] = arr[left-1] ^ arr[right];
            }
            else{
                mace[i] = arr[right];
            }
            i++;
        }

        return mace;
    }
}