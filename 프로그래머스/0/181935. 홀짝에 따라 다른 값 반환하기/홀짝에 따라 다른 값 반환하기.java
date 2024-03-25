class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 == 0){
            for(int i=0; i<n/2; i++){
                answer += Math.pow((i+1) * 2, 2);
            }
        } else {
            for(int i=0; i<n/2+1; i++){
                answer += i * 2 + 1;
            }
        }
        
        return answer;
    }
}