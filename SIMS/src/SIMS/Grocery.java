package SIMS;

/**
 *
 * @author mahmad
 */
public class Grocery extends Product<Grocerydetails> implements Repository<Product> {

    Grocery() {this.metaData=new Grocerydetails();}
    Grocery(int productId, String name, double price, String expiryDate, double weight, boolean isPerishable) {
        super(productId, name, price);
        this.metaData = new Grocerydetails(expiryDate, weight, isPerishable);
    }

    @Override
    public void calculateTotalprice() {
        this.price -= this.price * 0.10;
        System.out.println("Total price after 10% discount is " + this.price + " PKR");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ProductID: " + this.productId);
        System.out.println("Price: " + this.price + " PKR");
        System.out.println("Expiry Date: " + this.metaData.expiryDate);
        System.out.println("Weight: " + this.metaData.weight + " kg");
        System.out.println("Perishable: " + (this.metaData.isPerishable ? "Yes" : "No"));
    }
    
    @Override
    public void add(Product p){Menu.Storage.add(p);}
    
    @Override
    public void update(Product p){
    for(int i=0;i<Menu.Storage.size();i++){
    if(Menu.Storage.get(i).name.equals(p.name))
    {
     Menu.Storage.add(i, p);
    }
    else{
     continue;}
    }
    }
    
    @Override
    public void delete(Product p){
    for(int i=0;i<Menu.Storage.size();i++){
    if(Menu.Storage.get(i).name.equals(p.name))
    {
     Menu.Storage.remove(i);
    }
    else{
     continue;}
    }
    }
    
    @Override
    public void getAll(){
    for(int i=0;i<Menu.Storage.size();i++){
        Menu.Storage.get(i).displayInfo();
    }
    }
    
    @Override
    public void getById(int i){
    Menu.Storage.get(i).displayInfo();
    }
}
