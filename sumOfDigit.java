import java.util.Scanner;
public class sumOfDigit 
{
    public static void main(String args[])   
    {
       System.out.println("Sum od digits of the given number"); 
       int num,sum=0,rem;
       Scanner inp = new Scanner(System.in);
       num = inp.nextInt();
       while(num != 0)
       {
           rem = num%10;
           sum = sum+rem;
           num = num/10;
       }
       System.out.println("Sum of the digits is "+sum);
    }
}
