package concurrency;

import java.util.Scanner;

public class MultiThreading {

    public static void main(String args[]) throws Exception{
        Scanner inputReader = new Scanner(System.in);
        String userInput;
        Chef chef = new Chef();
        Entry newCustomer = new Entry();
        Attender attender1 = new Attender(0);
        Attender attender2 = new Attender(1);

        chef.start();
        newCustomer.start();
        attender1.start();
        attender2.start();

        //stop with any key exception
        while(true) {
            userInput = inputReader.next();
            chef.end();
            newCustomer.end();
            attender1.end();
            attender2.end();
            System.exit(0);
        }
    }
}
