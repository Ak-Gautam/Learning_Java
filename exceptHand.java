public class exceptHand {
    public static void main(String args[])
    {
        try{
            int a = 12, b = 0;
            int c = a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Displaying stack trace information...");
            e.printStackTrace();
            System.out.println("\nDescription of the exception : "+e.getMessage());
            System.out.println("\nString containing Description of the exception");
            System.out.println(e.toString());
        }
    }    
}
