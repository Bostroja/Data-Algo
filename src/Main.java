public class Main {

    public static void main(String[] args){

        System.out.println("Hello!");

        Car car = new Car("Volvo");
        Car car2 = new Car("Ford");

        System.out.println(car.getName());
        car.setName("BMW");
        System.out.println(car.getName());
        System.out.println(car2.getName());
    }

}
