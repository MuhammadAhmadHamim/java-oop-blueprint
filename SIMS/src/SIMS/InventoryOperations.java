package SIMS;

/**
 *
 * @author mahmad
 */
public interface InventoryOperations<T>{
            void shipProduct(T t1);
            void getShippedProducts();
            void getAvailableProducts();
}
