import java.util.ArrayList;
import java.util.List;

class feb14 {
    List<Integer> list;
    int prev;
    public void ProductOfNumbers() {
        list=new ArrayList<>();
        prev=1;
        list.add(1);
    }
    
    public void add(int num) {
        if(num>0){
            prev*=num;
            list.add(prev);
        }else{
            list=new ArrayList();
            list.add(1);
            prev=1;
        }
    }
    
    public int getProduct(int k) {
        int n = list.size();
        return k<n? prev/list.get(n-1-k):0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */