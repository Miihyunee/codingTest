class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        String[] code = new String[goal.length];
        for(int i = 0; i<goal.length; i++){
            if(idx1 < cards1.length && idx2 < cards2.length){
                if(goal[i].equals(cards1[idx1])){
                    code[i] = cards1[idx1];
                    idx1++;
                } else if(goal[i].equals(cards2[idx2])){
                    code[i] = cards2[idx2];
                    idx2++;
                } else {
                    answer = "No";
                    break;
                }
            } else if(idx1 < cards1.length && idx2 >= cards2.length){
                 if(goal[i].equals(cards1[idx1])){
                    code[i] = cards1[idx1];
                    idx1++;
                } else {
                    answer = "No";
                    break;
                }
            } else if(idx2 < cards2.length && idx1 >= cards1.length){
                 if(goal[i].equals(cards2[idx2])){
                    code[i] = cards2[idx2];
                    idx2++;
                } else {
                    answer = "No";
                    break;
                }
            }
        }
        return answer;
    }
}