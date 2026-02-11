package SIMS;

/**
 *
 * @author mahmad
 */
public class Fooddetails {
    String manufacturer;
    String expiryDate;  
    double weightInGrams;

    public Fooddetails() {}
    public Fooddetails(String manufacturer, String expiryDate, double weightInGrams) {
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.weightInGrams = weightInGrams;
    }
}
