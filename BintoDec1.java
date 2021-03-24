import java.util.Scanner;
//Binary to Decimal  Divide by 10.. base power of 2
public class BintoDec1 
{
    public static void main(String args[])
    {
        int num, sum=0, temp, rem, base=1 ;//base = 10 to the power of 0
        System.out.println("Enter the number");
        Scanner inp = new Scanner(System.in);
        num=inp.nextInt();
        temp=num; //Storing input in temp which can be used later
        while(num!=0)
        {
            rem=num%10;
            sum=sum+ rem * base;
            num = num/10;
            base = base * 2;
        }
        System.out.println("Binary number "+temp+" is represented in Decimal as "+sum);

        inp.close();
    }

}
