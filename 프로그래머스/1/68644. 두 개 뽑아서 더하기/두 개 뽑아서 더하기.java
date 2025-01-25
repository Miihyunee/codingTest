import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(i != j){
                   answer.add(numbers[i] + numbers[j]); 
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(answer);
		Collections.sort(list);
        return list;
    }
}