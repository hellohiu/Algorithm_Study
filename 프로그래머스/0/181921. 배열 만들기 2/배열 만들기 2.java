import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = "";
        int cnt = 0;
        
        for(int i=l; i<=r; i++){
            str += i;
            for(int j=0; j<str.length(); j++){
                cnt += !(str.charAt(j) == '0' || str.charAt(j) == '5') ? 1 : 0;
            }
            
            if(cnt == 0){
                list.add(Integer.parseInt(str));    
            }
            
            str = "";
            cnt = 0;
        }
        
        int[] answer = new int[list.size() == 0 ? 1 : list.size()];
        if(list.size() == 0){
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }            
        }
        
        return answer;
    }
}