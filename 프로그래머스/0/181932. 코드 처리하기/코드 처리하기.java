class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i) == '1'){
                mode = mode == 0 ? 1 : 0;
            } else {
                answer += mode == 0 && i % 2 == 0 ? code.charAt(i) : 
                          mode == 1 && i % 2 == 1 ? code.charAt(i) : "";
            }    
        }
        
        answer = answer.length() == 0 ? "EMPTY" : answer;
        
        return answer;
    }
}