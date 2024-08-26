class NonStaticMethod
{
  public static void main(String args[])
  {
   NonStaticMethod ob1= new NonStaticMethod();
   ob1.add(12,23);
   System.out.println(ob1);
  }
  void add(int a, int b)
  {
    System.out.println(a+b);
  }
}