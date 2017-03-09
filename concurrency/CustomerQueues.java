package concurrency;

import java.util.LinkedList;

final class CustomerQueues {
    private static LinkedList<Customer> customerQueue1 = new LinkedList<>();
    private static LinkedList<Customer> customerQueue2 = new LinkedList<>();

    public CustomerQueues() {
    ;
    }
    static void enterCustomer(int queue, Customer customer) {
        if (queue == 0) {
            customerQueue1.add(customer);
        }
        else {
            customerQueue2.add(customer);
        }
    }

    public static Customer customerAttender(int queue) {
        if (queue == 0) {
            if (customerQueue1.size() > 0)
                return customerQueue1.removeFirst();
            return null;
    }
    if (customerQueue2.size() > 0)
        return customerQueue2.removeFirst();
    return null;
    }
    public String toString() {
        return "\tQueue 1 :" + customerQueue1 +
            "\tQueue 2 :" + customerQueue2;
    }
}
