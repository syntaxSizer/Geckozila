package concurrency;
public class Attender extends Thread {
    private int whichFood;
    private boolean threadAlive = true;

    public Attender(int whichFood) {
        this.whichFood = whichFood;
    }
    public void run() {
        int timeToDecide = 0;
	Customer customer;

        while(this.threadAlive) {
	    customer = CustomerQueues.customerAttender(this.whichFood);
	    if (customer != null) {
                try {
                    this.sleep(customer.timeToDecide);
                    this.attender(customer);
		} catch (InterruptedException e) {
		    System.out.println("attender intrrupted...");
		}
            }
            else {
                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("attender interrupted");
                }
            }
        }
    }

    public void attender(Customer customer) {
        boolean sold = true;
        int wait = 0;
            while(sold) {
                switch(customer.desiredFood) {
                    case "burger":
                    if (FoodStock.cookSellBurger("sell"))
                        sold = false;
                    break;
                    case "sandwich":
                    if (FoodStock.cookSellSandwitch("sell"))
                        sold = false;
                    break;
                    case "sald":
                    if (FoodStock.cookSellSalad("sell"))
                        sold = false;
                    break;
                }
                if (sold) {
                    try {
                        this.sleep(1000);
                        wait++;
                    } catch (InterruptedException e) {
		        System.out.println("Attender interrupted wait for the food nigga ...");
                    }
                }
            }
        System.out.println("Customer #" + (customer.id + 1) + " buy a " + customer.desiredFood + " and in " + (customer.timeToDecide/1000) + " and wait for the food " + wait + " seconds");
        }
        public void end() {
	    // TODO Auto-generated method stub
            this.threadAlive = false;
        }
}
