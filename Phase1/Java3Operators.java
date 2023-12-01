public class Java3Operators {
    //here we talk about type casting

    public static void main(String[] args){

        int number1 = 232;
        float number2 = 221.32f;

        float numberSum = number2 + number1;
        int newNumber = (int) numberSum;
        
        double numberSum1 = (double)number1 / (double)number2;

        System.out.println(numberSum);
        System.out.println(newNumber);
        System.out.println(numberSum1);
    }
}
