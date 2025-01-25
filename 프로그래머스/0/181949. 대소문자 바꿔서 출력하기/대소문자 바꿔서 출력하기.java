import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] text = a.toCharArray();
        String result = "";
        for(int i = 0; i<text.length;i++){
            if(Integer.valueOf(text[i]) > 90){
                result += Character.toUpperCase(text[i]);
            } else {
                result += Character.toLowerCase(text[i]);
            }
        }
        System.out.print(result);
    }
}