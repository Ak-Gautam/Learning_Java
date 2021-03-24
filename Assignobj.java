class Farm 
{
     double length, width; //Attributes
     //Method to find area
     void area()  //void : does not return any value
     {
         double a;
         a=length*width;
         System.out.println("Area of Farm = "+a);
     }
} //end of class Farm


public class Assignobj
{
    public static void main(String args[])
    {
    //Create farm object f1
    Farm f1=new Farm();
    f1.length = 20;
    f1.width = 30; 
    System.out.println("Area of f1");
    f1.area(); 
    Farm f2=new Farm();
    f2=f1; //assigning f2 to f1
    System.out.println("Area of f2");
    f2.area();
    // changing f2 values will change f1 values too
    f2.length=10;
    f2.width=10;
    System.out.println("Area of f1");
    f1.area(); 
    System.out.println("Area of f2");
    f2.area();
    }
}
