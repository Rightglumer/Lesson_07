import java.util.Random;

public class Plate {
    public static final int MAX_FOOD = 30;

    int foodCount;

    public Plate(int startFood) {
        this.foodCount = startFood;
    }

    public Plate() {
        this.foodCount = new Random().nextInt(MAX_FOOD);
    }

    public int getFoodCount() {
        return foodCount;
    }

    public boolean isEmpty(){
        return foodCount == 0;
    }

    public int decreaseFood(int eatFood){
        int resFood;
        if (foodCount < eatFood){
            resFood = foodCount;
            foodCount = 0;
        }
        else {
            foodCount -= eatFood;
            resFood = eatFood;
        }
        return resFood;
    }

    public void fillPlate(int newFood){
        foodCount += newFood;
        if (foodCount > MAX_FOOD){
            foodCount = MAX_FOOD;
        }
    }
}
