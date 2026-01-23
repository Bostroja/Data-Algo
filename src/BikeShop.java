import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();
    Random random = new Random();


    public void addBike(Bike bike) {
        bike.setStock(random.nextInt(9)+1);
        bike.setStock(random.nextInt(1, 10)); //Funkkar i java 17 och frammåt
        bikes.add(bike);

    }

    public Bike getBike(int i) {
        return bikes.get(i);
    }

    public int getBikeCount() {
        return bikes.size();
    }


}