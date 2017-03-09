package concurrency;

public class FoodStock {
    private static int burger, sandwitch, sald;
    public FoodStock() {;}

    public static synchronized boolean cookSellBurger(String action) {
        if (action.equals("cook")) {
            burger++;
            return true;
        }
        else if (action.equals("sell")) {
            if (burger > 0) {
                burger --;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSandwitch(String action) {
        if (action.equals("cook")) {
            sandwitch++;
            return true;
        }
        else if (action.equals("sell")) {
            if (sandwitch > 0) {
                sandwitch --;
                return true;
            }
        }
        return false;
    }

    public static synchronized boolean cookSellSalad(String action) {
        if (action.equals("cook")) {
            sald++;
            return true;
        }
        else if (action.equals("sell")) {
            if (sald > 0) {
                sald --;
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "\tFood Stock Burger: " + burger + " " +sandwitch + " " + sald;

    }
}
