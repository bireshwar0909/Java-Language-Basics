package Basics.Phase4.Interface;

public class person implements student, youtuber {

    public static void main (String[] args){

        person hi = new person();
        hi.study();
        hi.makeVideo();


    }

    @Override
    public void study() {
        System.out.println("Person is studying");
        
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making video");
        
    }
    
}
