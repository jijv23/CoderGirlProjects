import static  java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
            out.print("Please list three items on your grocery shopping list.");
            out.println("Item 1?");
            String Item1= keyboard.next();
            out.println("Item 2?");
            String Item2= keyboard.next();
            out.println("Item 3?");
            String Item3= keyboard.next();
            out.print("Now, please enter the quantity of each item.");
            out.println("How many " +Item1+ "?");
            int Num1= keyboard.nextInt();
            keyboard.skip("\n");

            out.println("How many " +Item2 + "?" );
            int Num2= keyboard.nextInt();
            keyboard.skip("\n");

            out. println("How many " + Item3 + "?");
            int Num3= keyboard.nextInt();
            keyboard.skip("\n");

            out.println("Now, please enter the price of each item.");
            out.println("How much does one " + Item1 + " cost?");
            float price1= keyboard.nextFloat();



            out.println("How much does one " + Item2 + " cost?");
            float price2= keyboard.nextFloat();



            out.println("How much does one " + Item3 + " cost?");
            float price3= keyboard.nextFloat();

            out.println("Calculating your grocery bill.");
            float total= price1+ price2+ price3;
            out.print("Your total cost is " + (total));








    }
}


