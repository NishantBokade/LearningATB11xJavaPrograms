package ex_23_OOPS_Abstraction;

public class Lab167_AB_CARs {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }


}

abstract class Engine {

    abstract void startEngine();

    abstract void stopEngine();

    void normal() {
        System.out.println("Normal Function!");
    }
}
class WagonR extends Engine{

        @Override
        void startEngine() {
            System.out.println("Starting the car!");
        }

        @Override
        void stopEngine() {
            System.out.println("stopping the car!");
        }

       void drive(){
            startEngine();
            stopEngine();
        }
    } // Complete Class - No Abstract method

