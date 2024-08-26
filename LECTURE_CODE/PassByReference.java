class PassByReference
{    
   int Number;

   PassByReference() { Number = 0; }
 
    static void update(PassByReference ob) { ob.Number++; }
 
    public static void main(String[] args)
    {
        PassByReference ob = new PassByReference();
 
        System.out.println("Number value " + (ob.Number));
 
        update(ob);
 
        System.out.println("Updated Number value "+ (ob.Number));
    }
}