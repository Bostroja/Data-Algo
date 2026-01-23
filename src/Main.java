import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);
        /*
        System.out.print("Skriv någonting roligt: ");
        String str = textInput.nextLine();
        System.out.printf("Du skrev: %s\n", str);
        */

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(new Bike("Scott", 500));
        bikeShop.getBike(0).addSpec("wheel-size", "29 inch");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        bikeShop.addBike(new Bike("Jopo", 200));
        bikeShop.getBike(1).addSpec("wheel-size", "24 inch");
        bikeShop.getBike(1).addSpec("suspension", "none");

        bikeShop.addBike(new Bike("Yamaha", 700));
        bikeShop.getBike(2).addSpec("frame", "carbon");


        System.out.println("Välkommen till Bike Shop! Våra cyklar:");
        for (int i = 0; i < bikeShop.getBikeCount(); i++) {
            Bike bike = bikeShop.getBike(i);
            System.out.printf("%d - %s %.2f € saldo: %d\n%s",
                    i + 1,
                    bike.getName(),
                    bike.getPrice(),
                    bike.getStock(),
                    bike.getSpecsString());
        }

        while (true) {

            System.out.printf("\nVilken cykel vill du köpa? (1-%d, Q to quit): ",
                    bikeShop.getBikeCount());
            String bikeInput = textInput.nextLine();

            if (bikeInput.equalsIgnoreCase("q")){
                System.out.println("Tack, välkommen åter!");
                System.exit(0);
            }

            try {
                // Integer.parseInt(str) ändrar String till int
                int chosenBike = Integer.parseInt(bikeInput) - 1;
                Bike bikeOwned = bikeShop.getBike(chosenBike);
                System.out.printf("Grattis, du äger nu cykel %s\n", bikeOwned.getName());
                break; //Slutar loopen

            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Det finns ingen sådan cykel");
            } catch (Exception e){
                System.out.println("Någonting gick fel." + e.getMessage()); //Error meddelandet kan vara farligt om användaren ser för mycket info
            }
        }


        /*
        // Calculator Code Challenge
        CC_Calculator calculator = new CC_Calculator();
        System.out.println(calculator.multiply(5, 4));
        System.out.println(calculator.multiply(7, 6, 3));



        //Random Rundown CC
        Random random = new Random();
        while (true) {
            System.out.printf("Här är en slumpmässig nummer:%s ,vill du ha en ny nummer tryck enter, om du vill lämna tryck q\n",
            random.nextInt(1, 100)
            );
            if (textInput.nextLine().equalsIgnoreCase("q")){
                System.out.println("Hoppas det var roligt!");
                System.exit(0);
            }
        }*/
    }

}