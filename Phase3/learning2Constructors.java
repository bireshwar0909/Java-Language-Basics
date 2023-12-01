package Basics.Phase3;

class cars {
    int wheels;
    int headLights;
    int passenger;
    int weight;

    cars(int passenger, int weight) {                        //by default values
        wheels = 4;
        headLights = 2;
        this.passenger= passenger;
        this.weight = weight;
    }
}

public class learning2Constructors {
    // learning2Constructors() {
    //     System.out.println("object is now created");
    // }

    public static void main (String[] args){
        // learning2Constructors obj = new learning2Constructors();
        cars carA = new cars(4, 200);
        cars carB = new cars(4, 250);
        cars scooty = new cars(2, 100);

        carB.wheels = 8;
        scooty.wheels = 2;
        scooty.headLights = 3;

        System.out.println();
        System.out.println("My carA has " + carA.wheels + " Wheels");
        System.out.println("My carB has " + carB.wheels + " Wheels");
        System.out.println("My Scooty has " + scooty.wheels + " Wheels");
        System.out.println();

        System.out.println("My carB has " + carB.headLights + " Lights");
        System.out.println("My Scooty has " + scooty.wheels + " Lights");
        System.out.println();

        System.out.println("My carA can carry " + carA.passenger + " Passengers");
        System.out.println("My Scooty weighs " + scooty.weight + "kgs");

    }
}
