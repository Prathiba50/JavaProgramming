package Streams;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    Product(int ID , String Name, double Price){
        this.id = ID;
        this.name = Name;
        this.price = Price;
    }
}


public class FilterProducrPrice {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"HP",25000));
        products.add(new Product(2,"Lenovo",40000));
        products.add(new Product(3,"Dell",30000));
        products.add(new Product(4,"Microsoft",10000));
        products.add(new Product(5,"Acer",55000));

        products.stream().filter(product -> product.price > 25000)
                .forEach(p -> System.out.println(p.price));


    }
}
