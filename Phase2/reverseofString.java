package Basics.Phase2;

public class reverseofString {

    public static void main (String[] args){

        String line = "The sky is blue";
        String ans = "";

        int i = line.length()-1;
        
        while (i>=0) {

            while (i>=0 && line.charAt(i) == ' '){
                i--;
            }
            int j = i;

            if (i<0) break;

            while (i>=0 && line.charAt(i) != ' ') {
                i--;
            }

            if (ans.isEmpty()){
                ans = ans.concat(line.substring(i+1, j+1));
            }else{
                ans = ans.concat(" " + line.substring(i+1, j+1));
            }
            
        }
        System.out.println(ans);
    
    }
    
}
