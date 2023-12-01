package Basics.Phase2;

public class AnagramofString {
    public static void main(String[] args){

        //words like cat and act are anagram of each other
        String a = "cat";
        String b = "act";
        boolean isAmagram = false;
        boolean visited[] = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                
                for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == c && !visited[j]){
                    visited[j] = true;
                    isAmagram = true;
                    break;
                }  
                }
                if (!isAmagram){
                    break;
                }
            }
        if (isAmagram) {
                System.out.println("anagram");
        } else {
            System.out.println("Not anagram");
        }


        }
        
    }
    
}
