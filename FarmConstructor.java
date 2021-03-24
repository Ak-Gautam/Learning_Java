//constructor

class Farmm //using an extra 'm' as Farm was also used in the obj assign program.
{
    double length, width;
    Farmm(double l, double w)
    {
        System.out.println("Constructor called");
        length = l;
        width = w;
    }
    void area()
    {
        double a;
        a = length*width;
        System.out.println("Area = " +a);
    }
}


public class FarmConstructor 
{
    public static void main(String args[])
    {
        Farmm f1 = new Farmm(10,20);//calls the constructor Farm(l,w) automatically
        System.out.println("Area");
        f1.area();
        Farmm f2 = new Farmm(5.3, 4.2);//calls the constructor
        f2.area();
    }  
}
