
public class Product {

private String id;
private String name;
private double price;
private int quantity;


private static int counter=0;

    public Product(String name, double price, int quantity) {
        this.id=String.format("%03d",++counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name,double price){
        this(name,price,0);
    }

    public Product(String name){
        this(name,0.0,0);
    }
    
    public Product(){
        this("defaultName",0.0,0);
    }

public String getId() {
    return id;
}


public String getName() {
    return name;
}


public double getPrice() {
    return price;
}


public int getQuantity() {
    return quantity;
}


public static int getCounter() {
    return counter;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){

            return ("The id of product is: "+id+"\nThe name of product is: "+name+"\nThe price of the product is: "+price+"\nThe  Quantity of product is: "+quantity+"\n");
    }
    @Override
    public boolean equals(Object obj){

            Product temp =(Product)obj;
            return this.getName().equals(temp.getName());
    }


}