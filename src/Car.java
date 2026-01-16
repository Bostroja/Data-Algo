public class Car extends Vehicle {

    private int fuel = 0;

    //Overload
    //behövs för att tillåta olika parametrar
    public Car(String name, double price) {
        super(name,"Motorized");
        super.price = price;
        super.discount = 0.9499999;
    }

    public Car(String name) {
        super(name,"Motorized");
        super.discount = 0.9;
    }

    @Override
    public String soundWarning() {
        return "tut-tut";
    }
    public void refuel(int amount){
        fuel += amount;
    }
    public void refuel(){
        fuel = 100;
    }

}
