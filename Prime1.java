import java.util.Scanner;
public class Prime1 
{
    public static void main(String args[])
    {
        int num, i;
        System.out.println("Enter the number");
        Scanner inp = new Scanner(System.in);
        num=inp.nextInt();
        inp.close();
        //for(i=2;i<=num/2;i++)              //divide from 2 to num/2 
        for(i=2;i<=Math.sqrt(num);i++)      // divide from 2 to SQRT(number)
        {
            if(num%i==0)
            {
                System.out.println("Num "+num+" is not Prime since it is divisible by "+i);
                System.exit(0); //takes you out of the loop immediately
            }
        }
        System.out.println("Num "+num+" is Prime");

    } //end of main()
        
 } //end of class
