class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && b == c){
            answer = (int)(Math.pow(3, 3) * a * Math.pow(a, 2) * Math.pow(a, 3));
        } else if(a == b || b == c || a == c){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else {
            answer = a + b + c;
        }
        
        return answer;
    }
}