package Basics.Phase3;

public class learning6ExceptionHandling {
    public static void main(String[] args){

        fun1();

        try {
            int i = 4;
            int i2 = 0;

            int c = (i/i2);

            System.out.println(c);
        
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage() + " has occured please have a look");
        } finally {
            System.out.println("it will always run even if you miss any exception");
        }
    

        System.out.println("Hi");
        System.out.println();
    }
        static void fun1(){
            
            int i3 = 4;
            int i4 = 2;

            int c1 = (i3/i4);

            System.out.println(c1);

            boolean isdanger = true;
            if (isdanger){
                throw new ArrayIndexOutOfBoundsException("Danger is coming");
            }
        }
        
    
    
}
