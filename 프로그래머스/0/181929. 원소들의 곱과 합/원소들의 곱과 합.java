class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 1, num2 = 0;
        
        for(int num : num_list){
            num1 *= num;
            num2 += num;
        }
        
        answer = num1 > (int)Math.pow(num2, 2) ? 0 : 1;
        
        return answer;
    }
}