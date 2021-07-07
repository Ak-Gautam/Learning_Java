import java.util.Scanner;

public class odd_even 
{
    public static void main(String args[])
    {
        System.out.println("To check odd or even");
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        num = inp.nextInt();
        if(num%2 == 0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+"is odd");
        }
    }
    
}
