import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        int[] checker;
        
        
        answer = new int[commands.length];
        
        for(int i = 0; i < answer.length; i++){
            checker = new int[commands[i][1] - commands[i][0] + 1];
            
            for(int j = 0; j < checker.length; j++){
                checker[j] = array[commands[i][0] - 1 + j];
            }
            
            Arrays.sort(checker);
            
            answer[i] = checker[commands[i][2] - 1];
            
        }
        
        return answer;
    }
}