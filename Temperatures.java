public class Temperatures
{
    public static void main(String[] args)
    {
        System.out.println("Temperature Calculator");
        System.out.println("The data provided are: ");

        int[][] temps = new int[][]
                {      //0   1   2   3   4   5   6
                        {68, 70, 76, 70, 68, 71, 75},
                        {76, 76, 87, 84, 82, 75, 83},
                        {73, 72, 81, 78, 76, 73, 77},
                        {64, 65, 69, 68, 70, 74, 72}
                };
        String[] times = {
                "7AM: ", "3PM: ", "7PM: ", "3AM: "
        };
        String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};

        int total = 0;
        int sum = 0;

        for (int i = 0; i < temps.length; i++)
        {
            System.out.print(times[i]);
            for (int j = 0; j < temps[0].length; j++)
            {
                System.out.print(temps[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        System.out.println();

        int[] col =new int[temps[0].length];
        for (int i = 0; i < temps.length; i++)
        {

            for (int j = 0; j < temps[i].length; j++){

                sum += temps[i][j];
                col[j] += temps[i][j];
            }
            //System.out.println("Print the sum of rows =" + sum);
        }
        for(int k=0;k<col.length;k++)
        {
            //System.out.println(days[i]);
            int average= col[k]/4;
            //System.out.println(days[k] + col[k);
            System.out.println(days[k] + average);
        }

        System.out.println();

        for (int i= 0; i<4; i++)
        {
            // System.out.println(times[i]);
            //int average= sum/temps.length;
            for (int j = 0; j < temps[i].length; j++)
            {
                sum += temps[i][j];
                total += temps[i][j];
            }
            total=total/7;
            System.out.println(times[i]+ total);
            total=0;
        }
        System.out.println();

        System.out.println("The final average temperature of the week was:");
        System.out.println();
        int average= (sum/(temps.length*temps[0].length))/2;
        System.out.println("Overall: " + average);


    }

}