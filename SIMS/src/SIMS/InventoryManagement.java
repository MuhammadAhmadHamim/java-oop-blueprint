package SIMS;

/**
 *
 * @author mahmad
 */
public class InventoryManagement implements InventoryOperations<Product>{
    
    InventoryManagement(){}
    
    @Override
    public void shipProduct(Product p){
        new Electronics().delete(p);
        Menu.ShippedProducts.add(p);
    }
    
    @Override
    public void getShippedProducts(){
    for(Product p:Menu.ShippedProducts){
    p.displayInfo();
    }
    }
    
    @Override
    public void getAvailableProducts(){
    new Electronics().getAll();
    }
}
