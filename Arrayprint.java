import java.util.Scanner;
//Initialize Array and print it. Also use for-each loop to print
class Arrayprint
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the size of array ");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        int num[] = new int[n]; // Allocating memory based on n value to array num[]
        System.out.println("Enter the array elements ");
        for(int i=0; i<n; i++)
            num[i] = inp.nextInt();
        System.out.println("Array Elements are");
        for(int i=0;i<num.length; i++)
            System.out.println(num[i]);
        //for-each loop
        System.out.println("Print Array Elements using for-each loop");
        for(int x:num)
           System.out.println(x);



    }
}