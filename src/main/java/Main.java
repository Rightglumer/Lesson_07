import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int MAX_CAT_COUNT = 10;
    public static final String[] CAT_NAME = {"King", "Pretty", "Pharaon", "Beauty", "Lessy", "Mars", "Tiny", "Keeper", "Spoom", "Queen"};

    public static Cat[] cat = new Cat[new Random().nextInt(MAX_CAT_COUNT) + 1];
    public static Scanner sc = new Scanner(System.in);
    public static Plate plate = new Plate(Plate.MAX_FOOD);

    public static void main(String[] args) {
        String needContinue;
        int newFood;

        for (int i = 0; i < cat.length; i++){
            cat[i] = new Cat(CAT_NAME[i]);
        }

        do {
            System.out.println("---------------------");
            System.out.printf("In plate %d food\n", plate.getFoodCount());
            for (int i = 0; i < cat.length; i++){
                if (!cat[i].checkAndDecreeSleep()){
                    cat[i].Eat(plate);
                }
            }

            if (plate.isEmpty()){
                System.out.println("!!!!! --- Plate is empty. Please, fill it! (enter digit)");
                newFood = sc.nextInt();
                plate.fillPlate(newFood);
                sc.nextLine();
            }

            System.out.println("Do you wanna continue (y/n)?");
            needContinue = sc.nextLine();
            if (!needContinue.toUpperCase().equals("Y")){
                break;
            }
        } while (true);
    }
}
