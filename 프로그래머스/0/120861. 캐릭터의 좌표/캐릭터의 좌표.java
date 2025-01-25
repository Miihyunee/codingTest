class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        int h = board[1]/2;
        int w = board[0]/2;
        for(int i = 0; i<keyinput.length; i++){
            if(keyinput[i].equals("up")){
                if(answer[1] < h){
                    answer[1] += 1;
                }
            } else if(keyinput[i].equals("down")){
                if(answer[1] > (h*-1)){
                    answer[1] -= 1;
                }
            } else if(keyinput[i].equals("right")){
                if(answer[0] < w){
                    answer[0] += 1;
                }
            } else {
                if(answer[0] > (w*-1)){
                    answer[0] -= 1;
                }
            }
        }
        return answer;
    }
}