public class TestGarbage{

 public void finalize()
 {
	 System.out.println("object is garbage collected");
 }

 public static void main(String args[]){
  TestGarbage s1=new TestGarbage();
  TestGarbage s2=new TestGarbage();
  System.out.println(s1);
  System.out.println(s2);
  s1=null;
  s2=null;
  System.gc();
  System.out.println(s1);
  System.out.println(s2);
 }
}