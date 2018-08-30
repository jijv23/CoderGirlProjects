import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them?");
        //int number=0;
        int size= keyboard.nextInt();
        // size is no bigger than 20;
        //int size <= 20;

       //while (size <= 20)
        //{
        for (int x = 0; x <= size; x++)
        {
            //System.out.println((x) + " * " + (x) + " = " + (x * (x + 1)));

            for (int y = 0; y <= size; y++)
            {
                System.out.println((x) + " * " + (y) + " = " + (x *y));
            }
            //if (size > 20)
           // {
                //System.out.println("Pick a number 1- 20.");

            //}
           // for (int x = 0; x <= size; x++) {
                //System.out.println((x )+ " * " + x + " = " + (size * (x+1)));
            //}
       }
    }
}