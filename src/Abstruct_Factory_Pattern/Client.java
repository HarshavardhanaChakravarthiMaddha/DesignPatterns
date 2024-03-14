package Abstruct_Factory_Pattern;

public class Client {
    public static void main(String[] args) {
        VehicleFactory hyundaiFactory = new HyundaiFactory();
        Car hyundaiCar = hyundaiFactory.createCar();
        Bike hyundaiBike = hyundaiFactory.createBike();

        hyundaiCar.startCar();
        hyundaiBike.startBike();

        VehicleFactory toyotaFactory = new ToyotaFactory();
        Car toyotaCar = toyotaFactory.createCar();
        Bike toyotaBike = toyotaFactory.createBike();

        toyotaCar.startCar();
        toyotaBike.startBike();
    }

}
