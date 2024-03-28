import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(list.size() != 0 && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
                --i;
            } else {
                list.add(arr[i]);
            }
        }
        
        int[] stk = new int[list.size()];
        
        for(int i=0; i<stk.length; i++){
            stk[i] = list.get(i);
        }

        return stk;
    }
}