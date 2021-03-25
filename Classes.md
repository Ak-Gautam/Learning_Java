Classes

* ```java
  Nested:
  
  class OuterClass {
  // ...
  class NestedClass {
  // ...
  }
  }
  ```

* Types:
  
  * Non-static nested class (inner class)
  
  * Static nested class

* Non-Static Nested Class (Inner Class)
  
  * Non-static nested class is a class within another class, where the class has access to members of the enclosing class (outer class).

* ```java
  Example:
  class CPU {
  double price;
  class Processor{
  double cores;
  String manufacturer;
  double getCache(){
  return 4.3;
  }
  }class RAM{
  double memory;
  String manufacturer;
  double getClockSpeed(){
  return 5.5;
  }
  }
  }
  public class Main {
  public static void main(String[] args) {
  CPU cpu = new CPU();
  CPU.Processor processor = cpu.new Processor();
  CPU.RAM ram = cpu.new RAM();
  System.out.println("Processor Cache = " + processor.getCache());
  System.out.println("Ram Clock speed = " + ram.getClockSpeed());
  }
  }
  Output:
  Processor Cache = 4.3
  Ram Clock speed = 5.5
  ```

* Static Nested Class
  
  * In Java, you can also define a nested class static. Such class is known as static nested class. However, they are not called static inner class.
  
  * Unlike inner class, static nested class cannot access the member variables of the outer class because static nested class doesn't require you to create an instance of outer class.

* ```java
  Public class MotherBoard {
  String model;
  public MotherBoard(String model) {
  this.model = model;
  }
  static class USB{
  int usb2 = 2;
  int usb3 = 1;int getTotalPorts(){
  return usb2 + usb3;
  }
  }
  }
  public class Main {
  public static void main(String[] args) {
  MotherBoard.USB usb = new MotherBoard.USB();
  System.out.println("Total Ports = " + usb.getTotalPorts());
  }
  }
  ```

* Final Class
  
  * cannot have a subclass.
  
  * Used to create immutable classes like string.

* ```java
  final public class A {
  //code
  }
  class B extends A { // compilation error, A is final
  }
  ```

* Keyword : this
  
  * It can be used to refer instance variable of current class
    It can be used to invoke or initiate current class constructor
    It can be passed as an argument in the method call
    It can be passed as argument in the constructor call
    It can be used to return the current class instance

* ```java
  class Account {
  int id;
  Account(int id)
  {
  this.id = id;
  }
  void display()
  {
  System.out.println(id);
  }
  }
  public class Main {
  public static void main(String[] args) {
  Account a = new Account(23);
  a.display();
  }
  }
  Output:
  23
  ```

* Method Overloading

* Methods with the same name and scope are permitted provided they have different signatures that include:
  
  * Number of parameters
  
  * Types of parameters
  
  * Their order in the parameter list

* ```java
  class Sum {
  //sum takes two int parameters
  public int sum(int x, int y)
  {
  return (x + y);
  }
  //sum takes three int parameters
  public int sum(int x, int y, int z)
  {
  return (x + y + z);
  }
  //two double parameters
  public double sum(double x, double y)
  {
  return (x + y);
  }
  ```

* Nesting Methods
  
  * When a method in java calls another method in the same class, it is called Nesting of methods.

* ```java
  import java.util.Scanner;
  public class Nesting_Methods
  {
  int perimeter(int l, int b)
  {
  int pr = 2 * (l + b);
  return pr;
  }
  int area(int l, int b)
  {
  int pr = perimeter(l, b);
  System.out.println("Perimeter:"+pr);
  int ar = l * b;
  return ar;
  }
  public static void main(String[] args)
  {
  Scanner s = new Scanner(System.in);
  Nesting_Methods obj = new Nesting_Methods();
  int vol = obj.area(10,20);
  System.out.println("Area:"+vol);
  }
  }
  ```

* Final Variable
  
  * If you make any variable as final, you cannot change the value of final variable (It will be constant).

* ```java
  class Bike9{
  final int speedlimit=90;//final variable
  void run(){
  speedlimit=400; //program gives error because final var cant be changed
  }
  public static void main(String args[]){
  Bike9 obj=new Bike9();
  obj.run();
  }
  }//end of class
  Output:Compile Time Error
  ```

* Static Method
  
  * Static methods belong to the class, and therefore, it can be accessed without declaring an object of the class.

* ```java
  class Test
  {
  // static method
  static void m1()
  {
  System.out.println("from m1");
  }
  public static void main(String[] args)
  {
  // calling m1 without creating
  m1();
  }
  }
  ```

* Static variable
  
  * When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level.

* ```java
  public class Number_Objects
  {
  static int count=0;
  Number_Objects()
  {
  count++;
  }
  public static void main(String[] args)
  {
  Number_Objects obj1 = new Number_Objects();
  Number_Objects obj2 = new Number_Objects();
  Number_Objects obj3 = new Number_Objects();
  Number_Objects obj4 = new Number_Objects();
  System.out.println("Number of objects created:"+count);
  }
  }
  ```
