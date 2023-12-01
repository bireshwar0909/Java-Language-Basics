public class Java9Arrays {

    public static void main(String[] args) {

    //declearing an array is a bit different in java
    //as we have to write a little bit of extra code for it.

    //here we decleared an array with type int and name marks
    //later we told the compiler that how many elements it can hold

    int marks[] = new int [6];
    marks[0] = 22;
    marks[1] = 23;
    marks[2]= 24;
    marks[3] = 25;
    marks[4] = 26;
    marks[5] = 27;

    //printing the elements of the array
    for (int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
    }

    //another way of declearing an array
    int marks1[] = {1,2,3,4,5,6};
    for (int i=0; i<marks1.length; i++){
        System.out.println(marks1[i]);
    }
    }
    
}
