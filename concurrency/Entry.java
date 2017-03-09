package concurrency;

import java.util.Random;

public class Entry extends Thread{
    Random randomGenerator = new Random();
    private static int ids;
    private boolean threadAlive = true;

    public Entry() {
    ;
    }

    public void run() {
        int timeCustomerEnter = 0;
        while(this.threadAlive) {
            timeCustomerEnter = 1000 + 1000* randomGenerator.nextInt(3);
            try {
                this.sleep(timeCustomerEnter);
                this.entry(timeCustomerEnter);
            }catch(InterruptedException e) {}
        }
    }
    public void entry(int timeCustomerEnter) {
        int whichQueue = randomGenerator.nextInt(2);
        int whichFood = randomGenerator.nextInt(3);
        int timeToDecide = 1000 + 1000 * randomGenerator.nextInt(3);
        String foodName = "";

        switch(whichFood) {
            case 0:
                foodName = "burger";
            break;
            case 1:
                foodName = "sandwitch";
            break;
            case 2:
                foodName = "sald";
            break;
        }
        CustomerQueues.enterCustomer(whichQueue, new Customer(ids ++,timeToDecide, foodName));
        System.out.println("Customer # "+ ids + " enters " + (timeCustomerEnter/1000)
        + " seconds later to the queue " + (whichQueue + 1 ));
    }

    public void end() {
        this.threadAlive = false;
    }

}
