/**
 * Created by jubae on 09/27/2017.
 */
import java.util.Random;
public class randomNumberCreator {
    public static void main(String arg []){
       // Random();
        System.out.println("Randomly generated number is: "+Random());
    }
    public static int Random(){
        Random dice = new Random();
        int number = dice.nextInt(2);
        return number;
    }
}
