package Basics.Phase3;

public class learning4static {

    static {                                    //anything inside static will run before main method
        System.out.println("Hello");
    }

    static {
        System.out.println("Hello2");
    }

    public static void main(String[] args) {

        System.out.println("Hello inside main");


    }
    
}
