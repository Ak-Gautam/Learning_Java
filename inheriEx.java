class room
{
  int len,bre;
  room(int l,int b)
  {
    len=l;
    bre=b;
  }
  int area()
  {
    return len*bre;
  }
}

class hall extends room //inheritance
{
  int height;
  hall(int l,int b,int h)
  {
    super(l,b);
    height=h;
  }
  int volume()
  {
    return len*bre*height;
  }
}


class inheriEx
{
  public static void main(String[] args)
  {
    hall h1=new hall(10,15,10);
    System.out.println("Area of Hall = "+h1.area());
    System.out.println("Volume of Hall = "+h1.volume());
  }
}