//Method overriding

class X{
    void display()
    {
        System.out.println("This is class x");
    }
}

class Y extends X{
    void display()
    {
        System.out.println("this is class y");
        super.display();
    }
}

class Z extends Y{
    void display()
    {
        System.out.println("this is class z");
        super.display();
    }
}

public class methodOver {
    public static void main(String args[])
    {
        X outX = new X();
        Y outY = new Y();
        Z outZ = new Z();
        outX.display();
        outY.display();
        outZ.display();
    }
    
}
