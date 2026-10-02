import java.util.Random; 

public class DiceRoller 
{
    public static void main() 
    {

        Random rand = new Random();
        

        int diceRoll = rand.nextInt(6) + 1;
        

        System.out.println("You rolled a: " + diceRoll);
    }
}
