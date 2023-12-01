package Basics.Phase2;

public class UnderstandingStrings {
    public static void main(String[] args){
        String name = "Laptop";
        String name2 = new String("Laptop");
        System.out.println(name == name2);
        System.out.println();

        // char charAt(int index)
        System.out.println(name.charAt(0));
        System.out.println();

        // int length()
        System.out.println(name.length());
        System.out.println();

        // String substring(int beingIndex)
        System.out.println(name.substring(2));
        System.out.println();

        // String substring(int beingIndex, int endIndex)
        System.out.println(name.substring(2, name.length()-1));
        System.out.println();

        // boolean contains(CharSequence s)
        System.out.println(name.contains("a"));
        System.out.println();

        // boolean equals(Object another)
        System.out.println(name.equals(name2));
        System.out.println();

        // boolean isEmpty()
        System.out.println(name.isEmpty());
        System.out.println();

        // String concat(String str)
        System.out.println(name.concat(" New"));
        System.out.println();
        // String replace(char old, char new)
        System.out.println(name.replace("L", "A"));
        System.out.println();

        // String[] split(String regex)
        String Laptop = "Asus,Lenovo,Apple";
        String laptop[] = Laptop.split(",");
        for (String q:laptop){
            System.out.print(q+" ");
        }
        System.out.println();

        // int indexOf(int ch)
        System.out.println(name.indexOf("L"));
        System.out.println();

        // String toLowerCase()
        System.out.println(name.toLowerCase());
        System.out.println();

        // String toUpperCase()
        System.out.println(name.toUpperCase());
        System.out.println();

        // String trim()
        String m = "      Hello     ";
        System.out.println(m.trim());
    }
    
}
