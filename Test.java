
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Person owner1 =new Person("Noor","noor@email");
        Shop s1=new Shop("Shop1",owner1,"adress1");
    
    Product p1=new Product("product name 1",1.1,1);
    Product p2=new Product("product name 2",2.2,2);
    Product p3=new Product("product name 3",3.3,3);
    Product p4=new Product("product name 4",4.4,4);
    Product p5=new Product("product name 5",5.5,5);
    s1.alreadyAvailableProducts(p1); 
        s1.alreadyAvailableProducts(p2); 
        s1.alreadyAvailableProducts(p3);
        s1.alreadyAvailableProducts(p4);
        s1.alreadyAvailableProducts(p5);
        

        while(true){
            System.out.println("SHOP DETAILS!");
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter 1 to see the products available");
            System.out.println("\nEnter 2 to add a product");
            System.out.println("\nEnter 3 to buy a product");
            System.out.println("\nEnter 4 to update any product");
            System.out.println("\nEnter 0 to exit");
            int check=sc.nextInt();

            switch(check) {
            case 2:
            {
                System.out.println("FILL THE DETAILS BELOW");
                s1.add();
                break;
            }
            case 3:
            {
                System.out.println("ENJOY SHOPPING!");
                s1.sale();
                break;
            }
            case 1:
            {
                System.out.println("PRODUCT LIST:");
                s1.productsAvailable();
                break;

            }
            case 0:
            {
                System.out.println("EXITING!");
                System.exit(0);
                break;
            }
            case 4:{
                s1.updateproducts();
                break;
            }
            default:
            {
                System.out.println("please enter a valid digit");

            }

        }




        }
        
    }
}
