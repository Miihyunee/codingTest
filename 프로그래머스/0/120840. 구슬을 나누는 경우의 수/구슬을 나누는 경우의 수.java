class Solution {
    public int solution(int balls, int share) {
        double n = 1;
        double m = 1;
        for(int i = balls; i>share; i--){
            n *= i;
        }
        for(int i = 1; i<= (balls-share); i++){
            m *= i;
        }
        double answer = n/m;
        return (int)answer;
    }
}