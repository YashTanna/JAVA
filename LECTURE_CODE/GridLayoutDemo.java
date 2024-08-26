import java.awt.*;

class MyFrame3 extends Frame
{
  MyFrame3()
  {
   super("GridLayout Demo");
   setSize(600,400);
   setVisible(true);
   setLayout(new GridLayout(2,2));
   Button b1 = new Button("Submit");
   add(b1);
   Button b2 = new Button("Cancel");
   add(b2);
   Button b3 = new Button("Reset");
   add(b3);
   Button b4 = new Button("Ok");
   add(b4);
  }
}
class GridLayoutDemo
{
   public static void main(String args[])
   {
     new MyFrame3();
   }
}