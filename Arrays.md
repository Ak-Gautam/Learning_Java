Arrays

* ```java
  java.util.Array
  ```

* ```java
  public static void sort(Object a[]) //Quick sort, ascending order
  ```

* ```java
  public static int binarysearch(Object a[],Object key) //array must be sorted
  ```

* ```java
  Methods:
  
  Arrays.toString() 
  Arrays.fill()
  ```

* ```java
  Example_1:
  import java.util.Arrays;
  public class ArrayExample
  {
  public static void main(String[] args)
  {
  int intArr[] = {10,20,15,22,35};
  double doubleArr[] = {10.2,15.1,2.2,3.5};
  Arrays.sort(intArr);
  System.out.println("Sorted Integer");
  for (int i: intArr)
  System.out.println(i);
  Arrays.sort(doubleArr);
  System.out.println("Sorted Double");
  for (double i: doubleArr)
  System.out.println(i);
  int intKey = 22;
  double doubleKey = 2.5;
  System.out.println(intKey + " found at index = "
  +Arrays.binarySearch(intArr,intKey));
  System.out.println(doubleKey + " found at index = "
  +Arrays.binarySearch(doubleArr,doubleKey));
  }
  }
  Output:
  Sorted Integer
  10
  15
  20
  22
  35
  Sorted Double
  2.2
  3.5
  10.2
  15.1
  22 found at index = 3
  2.5 found at index = -2
  ```

* ```java
  Example_2:
  import java.util.Arrays;
  public class Main
  {
  static void display(int a[ ])
  {
  for (int i: a)System.out.println(i);
  }
  public static void main(String[] args)
  {
  int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
  display(ar);
  // Fill from index 1 to index 4 with 10.
  Arrays.fill(ar, 1, 5, 10);
  System.out.println(Arrays.toString(ar));
  Arrays.fill(ar, 99);
  display(ar);
  }
  }
  Output:
  2
  2
  2
  2
  2
  2
  2
  2
  2
  [2, 10, 10, 10, 10, 2, 2, 2, 2]
  99
  99
  99
  99
  99
  99
  99
  99
  99
  ```

2D Arrays

* A two – dimensional array can be seen as an array of one – dimensional array for easier understanding.

* ```java
  Declaration – Syntax:
  data_type[][] array_name = new data_type[x][y];
  For example: int[][] arr = new int[10][20];
  data_type[][] array_name = {
  {valueR1C1, valueR1C2, ....},
  {valueR2C1, valueR2C2, ....}
  };
  ```

* ```java
  Example:
  class Testarray3{
  public static void main(String args[]){
  //declaring and initializing 2D array
  int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
  //printing 2D array
  for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
  System.out.print(arr[i][j]+" ");
  }
  System.out.println();
  }
  }}
  Output:
  1 2 3
  2 4 5
  4 4 5
  ```

3D Arrays

* ```java
  Declaration-Syntax:
  data_type[][][] array_name = new data_type[x][y][z];
  For example: int[][][] arr = new int[10][20][30];
  ```

* ```java
  Data_Type[][][] Array_Name = new int[Tables][Row_Size][Column_Size];
  ```

* Tables: It will decide the number of tables an array can accept. Two Dimensional Array is always single table with rows and columns where as Multi Dimensional array in Java is more than 1 table with rows and columns.
  Row_Size: Please specify the number of Row elements an array can store.
  Column_Size: Number of Column elements an array can store.

* ```java
  import java.util.Scanner;public class JavaProgram
  {
  public static void main(String args[])
  {
  int arr[][][] = new int[3][4][2];
  int i, j, k, num=1;
  for(i=0; i<3; i++)
  {
  for(j=0; j<4; j++)
  {
  for(k=0; k<2; k++)
  {
  arr[i][j][k] = num;
  num++;
  }
  }
  }
  for(i=0; i<3; i++)
  {
  for(j=0; j<4; j++)
  {
  for(k=0; k<2; k++)
  {
  System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
  }
  System.out.println();
  }
  System.out.println();
  }
  }
  }
  ```
