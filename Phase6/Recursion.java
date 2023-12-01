package Basics.Phase6;

public class Recursion {

    public static void main(String[] args) {


        System.out.println(sum(5));
        System.out.println(power(5,2));
    }
   
    
    static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n + sum(n - 1);
    }

    static int power(int n, int x) {
        if (x==0){
            return 1;
        }
        
        return n*power(n, x-1);        
    }
}
