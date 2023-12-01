package Basics.Phase4.Abstraction.Cars;

public class RepairShop {

    public static void repairCar(Car car){
        System.out.println("Car is repaired");

    }

    public static void main(String[] args){

        WagonR WagonR1 = new WagonR();
        Audi Audi1 = new Audi();

        repairCar(WagonR1);
        repairCar(Audi1);


    }
    
}
