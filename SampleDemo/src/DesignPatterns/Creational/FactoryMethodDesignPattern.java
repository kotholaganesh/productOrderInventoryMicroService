package DesignPatterns.Creational;


abstract class Vehicle {
    abstract void printVehicle();
}

class twoWheeler extends Vehicle {
    @Override
    void printVehicle() {
        System.out.println("Two Wheeler");
    }
}

class FourWheeler extends Vehicle {
    @Override
    void printVehicle() {
        System.out.println("Four Wheeler");
    }
}

class Client {

    public Client(int type) {
        if (type == 1) {
            Vehicle vehicle = new twoWheeler();
            vehicle.printVehicle();
        } else {
            Vehicle vehicle = new FourWheeler();
            vehicle.printVehicle();
        }
    }
}

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        Client client = new Client(2);

    }
}


