public class Java11ExceptionHandling {
    
    public static void main(String[] args){

        //Exception Handling
        int a[] = new int[3];
        System.out.println(a[4]);
        System.out.println("Printing this line before the error");
        
        try {
            System.out.println(a[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            //if you write 'Exception' here ☝ then you dont have to specify the error
            System.out.println("We have an error here");
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Next line after error");
    }
    
}
