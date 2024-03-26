class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "", num2 = "";
        
        for(int num : num_list){
            if(num % 2 == 0){
                num2 += num;
            } else {
                num1 += num;
            }
        }       
        
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        return answer;
    }
}