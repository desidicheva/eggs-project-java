
//NAME:  R Grant
//DATE:  Jan/2014
import javax.swing.JOptionPane;
public class Eggs
{
   public static void main(String[] args)
   {
         /*
         customer gets a discount if they buy a full dozen as the cost per 
         egg is then $3.00 / 12 eggs or .25 per egg. However individual eggs are 30 cents each.
         */
         final double COST_PER_DOZEN = 3;//cost for a full dozen eggs;
         final double COST_PER_EGG = .3;//cost for any inidividual eggs up to a dozen
         
         String userInput; //user input for number of eggs purchased
         userInput = JOptionPane.showInputDialog ( null,
            "Enter number of eggs you purchased", 
            "Egg Count",
            JOptionPane.QUESTION_MESSAGE);

         //input is in String and we need to convert to an int
         int eggsPurchased = Integer.parseInt(userInput);
         //need to determine how many dozen eggs so divide the input by 12
         int dozensOfEggs = eggsPurchased / 12;
         
         /*
         also need to determine if there are any loose eggs - that is eggs, eggs left over
          that are not in a 12 egg carton. We use the modulus operator (%) to get the
         remainder of the expression below
         */
         int numberOfLooseEggs = eggsPurchased % 12;
         
         //now we can multiple by the two costs
         double totalCost =
            dozensOfEggs * COST_PER_DOZEN +     //cost for each dozen
            numberOfLooseEggs * COST_PER_EGG;   //cost of loose eggs
         
         //display the result
         JOptionPane.showMessageDialog( null,
            "The total price of your eggs is $" + totalCost,
            "Egg Prices",
            JOptionPane.INFORMATION_MESSAGE);
   }//end main
}//end class