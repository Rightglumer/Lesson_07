import java.util.Random;

public class Cat {

    String name;
    int maxAppetite;
    int appetite;
    int sleepCount;

    public Cat(String catName) {
        this.name = catName;
        maxAppetite = new Random().nextInt(5) + 5;
        appetite = maxAppetite;
        sleepCount = new Random().nextInt(appetite);
    }

    public void sayMeow(){
        System.out.printf("%s: MEEEEOW!!! MEEEOOOOOW!!! MMMMEEEEEEEEOOOOOWWWW!!!!\n", name);
    }

    public void sleep(){
        sleepCount = maxAppetite;
    }

    public void decreeSleep(){
        if (sleepCount > 0){
            sleepCount--;
        }
    }

    public boolean checkAndDecreeSleep(){
        decreeSleep();
        if (sleepCount > 0){
            System.out.printf("%s is sleeping for %d turns...\n", name, sleepCount);
        }
        else {
            appetite = maxAppetite;
        }
        return (sleepCount > 0);

    }

    public void checkAppetite() {
        if (appetite > 0){
            sayMeow();
        }
        else {
            System.out.printf("%s has eat and sleep...\n", name);
            sleep();
        }
    }

    public void Eat(Plate plate){
        appetite -= plate.decreaseFood(appetite);
        checkAppetite();
    }
}
