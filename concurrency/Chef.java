package concurrency;
import java.util.Random;

public class Chef extends Thread {
    Random rand = new Random();
    private boolean threadAlive = true;

    public Chef() {;}

    public void run () {
        int timeToCook = 0, whichFood = 0;
        while (threadAlive) {
            timeToCook = 2000 + 1000 * rand.nextInt(3);
            try {
                this.sleep(timeToCook);
                whichFood = rand.nextInt(3);
                System.out.println("Chef on " + (timeToCook/1000) + " seconds Cook a");
                switch(whichFood){
                    case 0:
                        FoodStock.cookSellBurger("cook");
                    break;
                    case 1:
                        FoodStock.cookSellSandwitch("cook");
                        System.out.println("sandwitch");
                    break;
                    case 2:
                        FoodStock.cookSellSalad("cook");
                        System.out.println("cook");
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println("Chef Interrupted");
            }
        }
    }
    public void end() {
        this.threadAlive = false;
    }
}
