public class Main {

    public static void main(String[] args){

        System.out.println("Hello!");

        Car car = new Car("Volvo");
        Car car2 = new Car("Ford");

        System.out.println(car.getName());
        Bike bike = new Bike("Scott");

        System.out.println(car.getName()+ " is " + car.getVehicleType());
        System.out.println(bike.getName()+ " is " + bike.getVehicleType());
    }

}
