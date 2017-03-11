package functionalInterfaces;

public class Product {
    public int id, stock;
    public String name, category;
    public float price;

    public Product(int id, String name, String category, float price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getCategory(){
        return category;
    }

    public float getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public String toString(){
        return name;
    }
}

