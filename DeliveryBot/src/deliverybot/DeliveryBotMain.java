
package deliverybot;

/**
 *
 * @author mahmad
 */
public class DeliveryBotMain {

    
    public static void main(String[] args) {
        DeliveryBot d1=new DeliveryBot();
        d1.deliverProduct("1", "brush");
        d1.printTotalDelieveredProducts();
    }
    
}
