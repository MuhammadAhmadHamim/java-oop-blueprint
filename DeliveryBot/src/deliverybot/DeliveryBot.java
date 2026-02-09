package deliverybot;
import java.util.Scanner;

/**
 *
 * @author mahmad
 */
public class DeliveryBot {
    static int botcount;
    String botId="BOT"+botcount;
    String currentLocation;
    String[] destination=new String[10];
    int totalDeliveriesDone;
    DeliveryBot(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the destination:");
            destination[i]=sc.nextLine();
            botcount++;
        }
    }
    void deliverProduct(String Destination,String product){
        boolean found=false;
        for(int i=0;i<10;i++){
            if(Destination.equals(this.destination[i])){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Bot "+this.botId+" delivering "+product+" product to "+Destination+" location");
        }
        else{
            System.out.println("Bot "+this.botId+" delivering "+product+" product to warehouse");
        }
        this.totalDeliveriesDone++;        
    }
    void printTotalDelieveredProducts(){
        System.out.println("Total deliveries done by the bot:"+this.totalDeliveriesDone);
    }
}
