// WAP to read n elements in an array. Find the sum and average
import java.util.Scanner;
public class ArraySum 
{
  public static void main(String args[])
  {
      //int a[60]; Static allocation vs Dynamic allocation 
      int n,i, sum=0; 
      float avg;
      System.out.println("Enter number of elemets");
      Scanner inp = new Scanner(System.in);
      n=inp.nextInt();
      int numbers[]=new int[n];//allocate memory based on n value
      System.out.println("Enter array elemets");
      for(i=0;i<n;i++)
       {
           numbers[i]=inp.nextInt();
       }
      System.out.println("Array elemets are");
      //for(int x:numbers) //using for each loop
      //   System.out.println(x); //if no braces after for loop it implies only one line belongs to for loop
      for(i=0;i<n;i++)
        sum=sum+numbers[i];
      //for(int x: numbers) //using for each loop
        //  sum = sum+x;
      System.out.println("Sum= "+sum);
      avg=(float)sum/n;//Typecast
      System.out.println("Average= "+avg); 


  } //end of main()
    
} //end of class
