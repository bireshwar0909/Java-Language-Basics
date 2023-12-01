public class Java10Methods {

    // function are called methods in java

    //here is our first method
    //its of static type which will return an int and its name is avg holding two parameters
    static int avg(int num1, int num2) {
        int sum = num1 + num2;
        return sum / 2;
    }

    public static void main(String[] args) {

        //since the method has a return type we have to call it with help from a variable
        //so we called the function avg with two arguments 3 and 2
        int x = avg(3, 2);
        System.out.println(x);

    }

}
