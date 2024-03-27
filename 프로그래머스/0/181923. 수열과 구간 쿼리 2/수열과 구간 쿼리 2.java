class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = -1;
        
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    num = num == -1 ? arr[j] : num > arr[j] ? arr[j] : num;
                }
            }
            answer[i] = num;
            num = -1;
        }
        
        return answer;
    }
}