import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;



        System.out.println("what is the length of the rectangle");

        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            in.nextLine(); // must lean buffer after reading a number
        }
        else
        {
            System.out.println("You entered an invalid number");
           System.exit(0);
        }

        System.out.println("what is the width of the rectangle");

        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine(); // must lean buffer after reading a number
        }
        else
        {
            System.out.println("You entered an invalid number");
            System.exit(0);
        }


        System.out.println("The area of the rectangle is " + (length * width));
        System.out.print("The length of diagonal is " + (Math.sqrt((length*length)+(width*width))));

    }
}