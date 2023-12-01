public class Java8Loops {
    
    public static void main(String[] args) {

        // for loops
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
// ------------------------------------------------------//

        // while loops
        int a = 100;
        while (true) {
            System.out.println(a);
            a--;
            if (a == 89) {
                break;
            }
        }
// ------------------------------------------------------//

        // do while loops
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 11);

    }
}
