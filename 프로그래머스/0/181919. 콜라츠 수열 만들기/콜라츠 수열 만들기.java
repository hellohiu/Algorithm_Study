import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int num = n;
        
        ArrayList list = new ArrayList<>();
        list.add(num);
        
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            list.add(num);
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++){
            int l = (int)list.get(i);
            answer[i] = l;
        }
        
        return answer;
    }
}