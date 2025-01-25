class Solution {
    public String solution(String polynomial) {
        String[] text = polynomial.split(" ");
        String answer = "";
        int a = 0;
        int b = 0;
        for(int i = 0; i<text.length; i++){
            if(text[i].contains("x")){
                text[i] = text[i].replace("x", "");
                if(text[i].length() == 0){
                    a += 1;
                } else {
                    a += Integer.parseInt(text[i]);
                }
            } else if(!text[i].equals("+")){
                b += Integer.parseInt(text[i]);   
            }
        }
        if(a > 0 && b > 0){
            if(a == 1){
                answer = String.valueOf("x + " + b);
            } else {
                answer = String.valueOf(a + "x + " + b);
            }
        } else if(b == 0){
            if(a == 1){
                answer = String.valueOf("x");
            } else {
                answer = String.valueOf(a + "x");
            }
        } else if(a == 0){
            answer = String.valueOf(b);
        }
        return answer;
    }
}