package SIMS;

/**
 *
 * @author mahmad
 */
public abstract class Product<T>{
    
    public int productId;
    public String name;
    public double price;
    protected T metaData;
   
   
   Product(){}
   Product(int productId,String name,double price){
   this.productId=productId;
   this.name=name;
   this.price=price;
   }
   Product(Product p){
   this.productId=p.productId;
   this.name=p.name;
   this.price=p.price;
   this.metaData=(T) p.metaData;
   }
   
   
   public abstract void calculateTotalprice();
   public abstract void displayInfo();
   
   
   void updatePrice(double newPrice){
   this.price=newPrice;
   }
   void reducePrice(double price){
   this.price-=price;
   }
   void increasePrice(double price){
   this.price+=price;
   }
   T getmetaData(){return this.metaData;}
   void setmetaData(T metaData){
   this.metaData=metaData;
   }
}
