class Solution {
    public int solution(String[] spell, String[] dic) {
        String[] what = new String[dic.length];
        int answer = 0;
        for(int i = 0; i<dic.length; i++){
            String corr = "";
            for(int j = 0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    corr += "O";
                } else {
                    corr += "X";
                }
            }
            what[i] = corr;
        }
        for(int i = 0; i<what.length; i++){
            if(what[i].contains("X")){
                answer = 2;
            } else {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}