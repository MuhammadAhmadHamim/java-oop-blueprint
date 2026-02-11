package SIMS;

/**
 *
 * @author mahmad
 */
public class Grocerydetails {
     String expiryDate;
    double weight;
    boolean isPerishable;
    
    Grocerydetails(){}
    public Grocerydetails(String expiryDate, double weight, boolean isPerishable) {
        this.expiryDate = expiryDate;
        this.weight = weight;
        this.isPerishable = isPerishable;
    }
}
