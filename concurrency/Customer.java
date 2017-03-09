packageconcurrency;

public class Customer {
    public int id, timeToDecide;
    public String desiredFood;

    public Customer(int id, int timeToDecide, String desiredFood) {
        this.id = id;
        this.timeToDecide = timeToDecide;
        this.desiredFood = desiredFood;
    }

    public String toString() {
    return "customer #" + this.id;
    }
}
