package SIMS;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mahmad
 */
public class Menu {

    public static Scanner sc=new Scanner(System.in);
    public static ArrayList<Product> Storage = new ArrayList();
    public static ArrayList<Product> ShippedProducts=new ArrayList();
    public static boolean isFinished=false;
    public static Product inputElectronics(){
    Product<Electronicdetails> p=new Electronics();
    System.out.println("Enter the name of the product:");
    p.name=sc.next();
    System.out.println("Enter the price of the product(in PKR):");
    p.price=sc.nextDouble();
    System.out.println("Enter the productId of the product:");
    p.productId=sc.nextInt();
    System.out.println("Enter the brand of the product:");
    p.metaData.brand=sc.next();
    System.out.println("Enter the power of the product(in hp):");
    p.metaData.power=sc.nextInt();
    System.out.println("Enter the warranty of the product(in months):");
    p.metaData.warrantyMonths=sc.nextInt();
    return p;
    }
    public static Product inputGrocery() {
    Product<Grocerydetails> p = new Grocery();
    System.out.println("Enter the name of the product:");
    p.name = sc.next();
    System.out.println("Enter the price of the product (in PKR):");
    p.price = sc.nextDouble();
    System.out.println("Enter the productId of the product:");
    p.productId = sc.nextInt();
    System.out.println("Enter the expiry date of the product:");
    p.metaData.expiryDate = sc.next();
    System.out.println("Enter the weight of the product (in kg):");
    p.metaData.weight = sc.nextDouble();
    System.out.println("Is the product perishable? (true/false):");
    p.metaData.isPerishable = sc.nextBoolean();
    return p;
}
    public static Product inputClothing() {
    Product<Clothingdetails> p = new Clothing();
    System.out.println("Enter the name of the product:");
    p.name = sc.next();
    System.out.println("Enter the price of the product(in PKR):");
    p.price = sc.nextDouble();
    System.out.println("Enter the productId of the product:");
    p.productId = sc.nextInt();
    System.out.println("Enter the material of the clothing:");
    p.metaData.material = sc.next();
    System.out.println("Enter the size of the clothing:");
    p.metaData.size = sc.next();
    System.out.println("Enter the color of the clothing:");
    p.metaData.color = sc.next();
    return p;
}
    public static Product inputFood() {
    Product<Fooddetails> p = new Food();
    System.out.println("Enter the name of the product:");
    p.name = sc.next();
    System.out.println("Enter the price of the product (in PKR):");
    p.price = sc.nextDouble();
    System.out.println("Enter the productId of the product:");
    p.productId = sc.nextInt();
    System.out.println("Enter the manufacturer of the food product:");
    p.metaData.manufacturer = sc.next();
    System.out.println("Enter the expiry date of the food product:");
    p.metaData.expiryDate = sc.next();
    System.out.println("Enter the weight of the food product (in grams):");
    p.metaData.weightInGrams = sc.nextDouble();
    return p;
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to Smart Inventory Management System!");
        while(true){
        int choice;
        System.out.println();
        System.out.println("1. Add different types of products");
        System.out.println("2. View available products");
        System.out.println("3. Edit any available product");
        System.out.println("4. Ship a product to a customer");
        System.out.println("5. Delete a product");
        System.out.println("6. Enable user to see the shipped product details");
        System.out.println("7. Exit");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                int choice2;
                System.out.println("Select the product you want to add:");
                System.out.println("1.Electronics");
                System.out.println("2.Grocery");
                System.out.println("3.Clothing");
                System.out.println("4.Food");
                choice2=sc.nextInt();
                switch(choice2){
                    case 1:
                        Storage.add(Menu.inputElectronics());
                        System.out.println("Electronics successfully added!");
                        break;
                    case 2:
                        Storage.add(Menu.inputGrocery());
                        System.out.println("Grocery successfully added!");
                        break;
                    case 3:
                        Storage.add(Menu.inputClothing());
                        System.out.println("Clothing successfully added!");
                        break;
                    case 4:
                        Storage.add(Menu.inputFood());
                        System.out.println("Food successfully added!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            break;
            
            case 2:
                for(Product p:Menu.Storage){
                p.displayInfo();
                }
            break;
            
            case 3:
            int choice3;
                System.out.println("Select the product you want to edit:");
                System.out.println("1.Electronics");
                System.out.println("2.Grocery");
                System.out.println("3.Clothing");
                System.out.println("4.Food");
                choice3=sc.nextInt();
                switch(choice3){
                    case 1:
                        new Electronics().update(inputElectronics());   
                        System.out.println("Electronics successfully updated!");
                        break;
                    case 2:
                        new Grocery().update(inputGrocery());
                        System.out.println("Grocery successfully updated!");
                        break;
                    case 3:
                        new Clothing().update(inputClothing());
                        System.out.println("Clothing successfully updated!");
                        break;
                    case 4:
                        new Food().update(inputFood());
                        System.out.println("Food successfully updated!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            break;
            case 4:
              int choice4;
              System.out.println("Select the product you want to ship:");
                System.out.println("1.Electronics");
                System.out.println("2.Grocery");
                System.out.println("3.Clothing");
                System.out.println("4.Food");
                choice4=sc.nextInt();
              switch(choice4){
                    case 1:
                        new InventoryManagement().shipProduct(inputElectronics());
                        System.out.println("Electronics successfully shipped!");
                        break;
                    case 2:
                        new InventoryManagement().shipProduct(inputGrocery());
                        System.out.println("Grocery successfully shipped!");
                        break;
                    case 3:
                        new InventoryManagement().shipProduct(inputClothing());
                        System.out.println("Clothing successfully shipped!");
                        break;
                    case 4:
                        new InventoryManagement().shipProduct(inputFood());
                        System.out.println("Food successfully shipped!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
              }
            break;
            case 5:
            int choice5;
                System.out.println("Select the product you want to remove:");
                System.out.println("1.Electronics");
                System.out.println("2.Grocery");
                System.out.println("3.Clothing");
                System.out.println("4.Food");
                choice5=sc.nextInt();
                switch(choice5){
                    case 1:
                       new Electronics().delete(inputElectronics());
                        System.out.println("Electronics successfully removed!");
                        break;
                    case 2:
                        new Grocery().delete(inputGrocery());
                        System.out.println("Grocery successfully removed!");
                        break;
                    case 3:
                        new Clothing().delete(inputClothing());
                        System.out.println("Clothing successfully updated!");
                        break;
                    case 4:
                        new Food().delete(inputFood());
                        System.out.println("Food successfully deleted!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
            break;
            case 6:
                new InventoryManagement().getShippedProducts();
            break;
            case 7:
            Menu.isFinished=true;
            System.out.println("Thanks for using our Smart Inventory Management System!");
            break;
            default:
               System.out.println("Invalid Input!");
        }
        if(Menu.isFinished){break;}
        else{continue;}
        }
    }
}
