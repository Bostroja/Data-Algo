public class Main {

    public static void main(String[] args){

        Vehicle car = new Car("Audi", 14000);
        Vehicle bike = new Bike("Yamaha");
        Car car2 = new Car ("Volvo");
        Vehicle todaysVehicle;

        //Abstract class gör detta omöjligt
        //Vehicle boat = new Vehicle("Buster","båt");

        //car.setPrice(10000);

        //Finare formattering
        System.out.printf("%s kostar %.2f €\n",
                car.getName(),
                car.getPrice()
        );
        System.out.println(car.getName() + " kostar " + car.getPrice());


        todaysVehicle = car;
        System.out.printf("I dag åker jag %s\n",todaysVehicle.getName());
        todaysVehicle = bike;
        System.out.printf("Imorgon åker jag %s\n",todaysVehicle.getName());

        //overload
        car2.refuel();
        car2.refuel(50);

        Shirt shirt = new Shirt("H&M", "White", "20");
        Trousers trousers = new Trousers("Lidl","Blue","50");

        //Lektionsexempel
        System.out.println(car.getName()+ " is " + car.getVehicleType());
        System.out.println(bike.getName()+ " is " + bike.getVehicleType());




        System.out.println(car.getName() + " säger " + car.soundWarning());
        System.out.println(bike.getName() + " säger " + bike.soundWarning());


        //Clothing CC
        System.out.println("Skjortan är märket: " + shirt.getBrand() + " är " + shirt.getColor()+ " och kostar " + shirt.getPrice());
        System.out.println("Byxorna är märket: " +trousers.getBrand() + " är " + trousers.getColor()+ " och kostar " + trousers.getPrice());

    }

}
