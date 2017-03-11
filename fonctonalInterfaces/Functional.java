package functionalInterfaces;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Functional {
    // empty list that holds prducts data type
    List<Product> technologystore;

    public Functional(){
        technologystore = new ArrayList<>();
    }

    //Read from file products.txt the list of products
    //Format: Name Categorie Stock Price
    public void readProductsFile() {
        String filePath = "src/functionalInterfaces/products.txt";
        BufferedReader input = null;
        try {
            input = new BufferedReader( new FileReader(filePath) );

            //Create the Product List
            //technologystore = ?;
            String name = "", category = "";
            int id = 1, stock = 0;
            float price = 0;
            String line;
            while((line = input.readLine()) != null){
                String[] arrayLine = line.split("\\s+");
                name = arrayLine[0];
                category = arrayLine[1];
                // make sure to cast to the right data type of Product class
                // because all the data we are getting from the text file are of type String
                stock = Integer.parseInt(arrayLine[2]);
                price = Float.parseFloat(arrayLine[3]);
                // creat a new Product object and add it to the list
                technologystore.add(new Product(id, name, category, price, stock));
                id++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (input != null){
                    input.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

  //Print each of the products
    public void printProducts() {
        String print = technologystore.stream().map(store -> store.toString()).collect(Collectors.joining(" "));
        System.out.println(print);
    }

    //Filter and print from the list all the products that are Accessories
    public void filter2() {
        String print = technologystore.stream()
                        .filter(store -> store.getCategory().equals("Accessories"))
                        .map(store -> store.toString())
                        .collect(Collectors.joining(" "));
        System.out.println(print);
    }

    //Filter and print from the list all the products that the stock is more or equal to 50
    public void filter3() {
        String print = technologystore.stream()
                        .filter(store -> store.getStock() >= 50)
                        .map(store -> store.toString())
                        .collect(Collectors.joining(" "));
        System.out.println(print);
    }

    //Filter and print from the list all the products that: are cheaper than $150.00 and has more than 25 in stock
    public void filter4() {
        String print = technologystore.stream()
                        .filter(store -> store.getStock() > 25 && store.getPrice() < 150.0)
                        .map(store -> store.toString())
                        .collect(Collectors.joining(" "));
        System.out.println(print);
    }

    public void filter5() {
        //Remove from the list (don't print) if product: the categorie is Office
        //Your Code here
        Predicate<Product> category = product -> product.getCategory().equals("Office");
        technologystore.removeIf(category);

        //Remove from the list (don't print) if product: has less than 30 in stock
        //Your Code here
        Predicate<Product> stock = product -> product.getStock() > 30;
        technologystore.removeIf(stock);

        //Remove from the list (don't print) if product: are cheaper than $250.00
        //Your Code here
        Predicate<Product> price = product -> product.getPrice() < 250.0;
        technologystore.removeIf(price);

        //Print each of the products that left
        //Your Code here
        String print = technologystore.stream()
                        .map(store -> store.toString())
                        .collect(Collectors.joining(" "));
        System.out.println(print);
    }

    public static void main(String[] args) throws Exception {
        Functional activity4 = new Functional();
        activity4.readProductsFile();
        System.out.println("- Filter 1");
        activity4.printProducts();
        System.out.println("- Filter 2");
        activity4.filter2();
        System.out.println("- Filter 3");
        activity4.filter3();
        System.out.println("- Filter 4");
        activity4.filter4();
        System.out.println("- Filter 5");
        activity4.filter5();
