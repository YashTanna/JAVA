package Collages;

class FacultyName implements Faculty
{
   public void FirstYearFaculty()
   {
     System.out.println("Firstyear");
   }
   public void SecondYearFaculty()
   {
     System.out.println("Secondyear");
   }
   public static void main(String args[])
   {
        FacultyName f1 = new FacultyName();
        f1.FirstYearFaculty();
        f1.SecondYearFaculty();		
   }

}