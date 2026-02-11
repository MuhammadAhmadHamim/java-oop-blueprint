package SIMS;

/**
 *
 * @author mahmad
 */
public class Electronics extends Product<Electronicdetails> implements Repository<Product>{
    
    Electronics(){this.metaData=new Electronicdetails();}
    Electronics(int productId,String name,double price,int warrantyMonths,String brand,int power){
    super(productId,name,price);
    this.metaData=new Electronicdetails(warrantyMonths,brand,power);
    }
    
    @Override
    public void calculateTotalprice(){
    this.price-=price*(5/100);
    System.out.println("Total price after 5% discount is "+this.price+" PKR");
    }
    @Override
    public void displayInfo(){
    System.out.println("Name:"+this.name);
    System.out.println("ProductID:"+this.productId);
    System.out.println("Price:"+this.price+"PKR");
    System.out.println("Brand:"+this.metaData.brand);
    System.out.println("Power:"+this.metaData.power+"hp");
    System.out.println("Warranty:"+this.metaData.warrantyMonths+"months");
    }
    
    @Override
    public void add(Product p){Menu.Storage.add(p);}
    
    @Override
    public void update(Product p){
    for(int i=0;i<Menu.Storage.size();i++){
    if(Menu.Storage.get(i).name.equals(p.name))
    {
     Menu.Storage.set(i, p);
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
