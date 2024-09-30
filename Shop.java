import java.util.Scanner;

public class Shop {
    private String name;
    private Person owner;
    private String adress;
    private Product productlist[] =new Product[100];
    public static int productcount=0;
    public static double income=0;


    public Shop(String name,Person owner,String adress){
        this.name=name;
        this.owner=owner;
        this.adress=adress;

    }
   

    public void setName(String name){      
        this.name=name;

    }
    public String getName(){

        return name;
    }
    public void setOwner(Person owner){
        this.owner=owner;
    }
    public Person getOwner(){
            return owner;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    public String adress(){

        return adress;
    }
    public Product[] getProductlist() {
        return productlist;
    }

    public void setProductlist(Product[] productlist) {
        this.productlist = productlist;
    }

    @Override
    public String toString(){
        return"The name of Shop is: "+name+"The adress of shop is: "+adress+"The owner of shop is: "+owner;
    }
    public void add(){

        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter the name of product:");
        String name1=sc.nextLine();
        System.out.println(("\nEnter the price of the product:"));
        double price=sc.nextDouble();
        System.out.println("\nEnter the quantity of the product:");
        int quantity=sc.nextInt();
        
        productlist[productcount]=new Product(name1,price,quantity);
        productcount++;
        System.out.println("\nYour product is added");
    

    }
    public void sale(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of product you want to buy");
        String id=sc.nextLine();
        boolean flag=false;

        for(int i=0;i<productcount;i++){
           if(productlist[i].getId().equals(id)&&productlist[i].getQuantity()>0)
           {
            flag=true;
            income+=productlist[i].getPrice();
            productlist[i].setQuantity(productlist[i].getQuantity()-1);
            }
        
         }
         if(flag==true){
            System.out.println("Shopping successful");
         }
         else{
            System.out.println("Product not found!");
         }
         

    }


    public void productsAvailable(){

        for(int i=0;i<productcount;i++){
            if(productlist[i].getQuantity()==0){
                System.out.println("The product id "+productlist[i].getId()+" is sold out\n" );

            }
            else
           {
            System.out.println("Product details:");
            System.out.println(productlist[i]);
           }
        }

    }

    public void updateproducts(){

        System.out.println("Enter the id of product you want to update:\n");
        Scanner s=new Scanner(System.in);
        String checker=s.nextLine();
    
        boolean flag1=false;
        for(int i=0;i<productcount;i++)
        {
           if(productlist[i].getId().equals(checker))
            {
                flag1=true;
                System.out.println("Enter n to change the name of product");
                System.out.println("Enter p to change the price:");
                System.out.println("Enter q to change the quantity");
                String n1=s.nextLine();
                if(n1.equals("n")){
                    System.out.println("Enter the new name:\n");
                    String name2=s.nextLine();
                    productlist[i].setName(name2);
                    System.out.println("Name updated!");

                }
                else if(n1.equals("p")){
                    System.out.println("Enter the new price:\n");
                    double price=s.nextDouble();
                    s.nextLine();
                    productlist[i].setPrice(price);
                    System.out.println("price updated!");

                }
                else if(n1.equals("q")){
                    System.out.println("Enter new quantity");
                    int quantity=s.nextInt();
                    s.nextLine();
                    productlist[i].setQuantity(quantity);
                    System.out.println("Quantity updated!");
                }
                else{
                    System.out.println("Enter a valid alphabet!");
                }
                
            }
    
            
        }

        if(flag1==false){
            System.out.println("Product ID not found!");
        }
        

    }

    public void alreadyAvailableProducts(Product p){
     
     productlist[productcount]=p;
    productcount++;   
    }

    
    
}
