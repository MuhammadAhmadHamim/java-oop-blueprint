package SIMS;

/**
 *
 * @author mahmad
 */
public class Clothing extends Product<Clothingdetails> implements Repository<Product> {

    Clothing(){this.metaData=new Clothingdetails();}

    Clothing(int productId, String name, double price, String size, String material, String color) {
        super(productId, name, price);
        this.metaData = new Clothingdetails(size, material, color);
    }

    @Override
    public void calculateTotalprice() {
        this.price -= this.price * 0.15;
        System.out.println("Total price after 15% discount is " + this.price + " PKR");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ProductID: " + this.productId);
        System.out.println("Price: " + this.price + " PKR");
        System.out.println("Size: " + this.metaData.size);
        System.out.println("Material: " + this.metaData.material);
        System.out.println("Color: " + this.metaData.color);
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
