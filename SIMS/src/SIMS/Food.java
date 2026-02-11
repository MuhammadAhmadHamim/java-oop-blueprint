package SIMS;

/**
 *
 * @author mahmad
 */
public class Food extends Product<Fooddetails> implements Repository<Product>{
    
    Food(){this.metaData=new Fooddetails();}
    Food(int productId, String name, double price, String manufacturer, String expiryDate, double weightInGrams) {
        super(productId, name, price);
        this.metaData = new Fooddetails(manufacturer, expiryDate, weightInGrams);
    }

    @Override
    public void calculateTotalprice() {
        this.price -= this.price * 0.12;
        System.out.println("Total price after 12% discount is " + this.price + " PKR");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ProductID: " + this.productId);
        System.out.println("Price: " + this.price + " PKR");
        System.out.println("Manufacturer: " + this.metaData.manufacturer);
        System.out.println("Expiry Date: " + this.metaData.expiryDate);
        System.out.println("Weight: " + this.metaData.weightInGrams + " grams");
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
