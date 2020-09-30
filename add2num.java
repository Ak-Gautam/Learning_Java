import java.util.Scanner;
public class add2num 
{
    public static void main(String args[])
    {
        System.out.println("Addition of 2 numbers");
        int a, b, c;
        // To read class we use scanner class
        // We create a scanner objectt..
        // We need to import Scanner utility
        Scanner inp = new Scanner(System.in);
        System.out.println("Enetr two numbers");
        a = inp.nextInt();
        b = inp.nextInt();
        c = a + b;
        System.out.println("Sum = "+c);
    }
    
}
