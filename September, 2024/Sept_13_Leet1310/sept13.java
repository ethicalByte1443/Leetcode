public class sept13{

//     The approach taken in the code is as follows:

//     # Prefix XOR Calculation:
//     Transform the arr[] so that arr[i] holds the XOR of all elements from index 0 to i.
//     This allows range XOR queries to be answered efficiently.

//     # Answering Queries:
//     For each query [left, right], if left == 0, the result is arr[right].
//     Otherwise, the result is arr[left-1] ^ arr[right], which gives the XOR of elements from left to right.

//     # Store Results:
//     Store the results in the mace[] array for each query. Return mace[] as the final result.
//     This reduces the time complexity of each query to O(1) after preprocessing the array in O(n).
    

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
    public static void main(String[] args) {
        sept13 obj = new sept13();
        int arr[]={16};
        int queries[][]={{0,0},{0,0},{0,0}};
        int answer[] = obj.xorQueries(arr, queries);
        System.out.println(answer.toString());
    }
}