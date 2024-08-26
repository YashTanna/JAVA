// //listing 2
// class Exc1 {
//   static void subroutine() {
//     int d = 0;
//     int a = 10 / d;
//   }
//   public static void main(String args[]) {
//     Exc1.subroutine();
//   }
// }

// listing 3
// class Exc2 {
//   public static void main(String args[]) {
//     int d, a;

//     try { // monitor a block of code.
//       d = 0;
//       a = 42 / d;
//       System.out.println("This will not be printed.");
//     } catch (ArithmeticException e) { // catch divide-by-zero error
//       System.out.println("Division by zero.");
//     }
//     System.out.println("After catch statement.");
//   }
// }

// //listing 4
// // Handle an exception and move on.
// import java.util.Random;

// class HandleError {
//   public static void main(String args[]) {
//     int a=0, b=0, c=0;
//     Random r = new Random();

//     for(int i=0; i<32000; i++) {
//       try {
//         b = r.nextInt();
//         c = r.nextInt();
//         a = 12345 / (b/c);
//       } catch (ArithmeticException e) {
//         System.out.println("Division by zero.");
//         a = 0; // set a to zero and continue
//       }
//       System.out.println("a: " + a);
//     }
//   }
// }

// //listing 5
// catch (ArithmeticException e) {
//   System.out.println("Exception: " + e);
//   a = 0; // set a to zero and continue
// }

// //listing 6
// // Demonstrate multiple catch statements.
// class MultipleCatches {
//   public static void main(String args[]) {
//     try {
//       int a = args.length;
//       System.out.println("a = " + a);
//       int b = 42 / a;
//       int c[] = { 1 };
//       c[42] = 99;
//     } catch(ArithmeticException e) {
//       System.out.println("Divide by 0: " + e);
//     } catch(ArrayIndexOutOfBoundsException e) {
//       System.out.println("Array index oob: " + e);
//     }
//     System.out.println("After try/catch blocks.");
//   }
// }

// // listing 7
// /*  This program contains an error.
 
//    A subclass must come before its superclass in 
//    a series of catch statements. If not, 
//    unreachable code will be created and a
//    compile-time error will result.
// */
// class SuperSubCatch {
//   public static void main(String args[]) {
//     try {
//       int a = 0;
//       int b = 42 / a;
//     } catch(Exception e) {
//       System.out.println("Generic Exception catch.");
//     }
//     /* This catch is never reached because
//        ArithmeticException is a subclass of Exception. */
//     catch(ArithmeticException e) { // ERROR - unreachable
//       System.out.println("This is never reached.");
//     }
//   }
// }

// // listing 8
// // An example nested try statements.
// class NestTry {
//   public static void main(String args[]) {
//     try {
//       int a = args.length;

//       /* If no command line args are present,
//          the following statement will generate
//          a divide-by-zero exception. */
//       int b = 42 / a;

//       System.out.println("a = " + a);

//       try { // nested try block
//         /* If one command line arg is used,
//            then an divide-by-zero exception 
//            will be generated by the following code. */
//         if(a==1) a = a/(a-a); // division by zero

//         /* If two command line args are used
//            then generate an out-of-bounds exception. */
//         if(a==2) {
//           int c[] = { 1 };
//           c[42] = 99; // generate an out-of-bounds exception
//         }
//       } catch(ArrayIndexOutOfBoundsException e) {
//         System.out.println("Array index out-of-bounds: " + e);
//       }

//     } catch(ArithmeticException e) {
//       System.out.println("Divide by 0: " + e);
//     }
//   }
// }

// // listing 9
// /* Try statements can be implicitly nested via
//    calls to methods. */
// class MethNestTry {
//   static void nesttry(int a) {
//     try { // nested try block
//       /* If one command line arg is used,
//          then an divide-by-zero exception 
//          will be generated by the following code. */
//       if(a==1) a = a/(a-a); // division by zero

//       /* If two command line args are used
//          then generate an out-of-bounds exception. */     
//       if(a==2) {
//         int c[] = { 1 };
//         c[42] = 99; // generate an out-of-bounds exception
//       }
//     } catch(ArrayIndexOutOfBoundsException e) {
//       System.out.println("Array index out-of-bounds: " + e);
//     }
//   }

//   public static void main(String args[]) {
//     try {
//       int a = args.length;

//       /* If no command line args are present,
//          the following statement will generate
//          a divide-by-zero exception. */
//       int b = 42 / a;

//       System.out.println("a = " + a);

//       nesttry(a);
//     } catch(ArithmeticException e) {
//       System.out.println("Divide by 0: " + e);
//     }
//   }
// }

// // listing 10
// // Demonstrate throw.
// class ThrowDemo {
//   static void demoproc() {
//     try {
//       throw new NullPointerException("demo");
//     } catch(NullPointerException e) {
//       System.out.println("Caught inside demoproc.");
//       throw e; // re-throw the exception
//     }
//   }

//   public static void main(String args[]) {
//     try {
//       demoproc();
//     } catch(NullPointerException e) {
//       System.out.println("Recaught: " + e);
//     }
//   }
// }


// // listing 11
// // This program contains an error and will not compile.
// class ThrowsDemo {
//   static void throwOne() {
//     System.out.println("Inside throwOne.");
//     throw new IllegalAccessException("demo");
//   }
//   public static void main(String args[]) {
//     throwOne();
//   }
// }

// // listing 12
// // This is now correct.
// class ThrowsDemo {
//   static void throwOne() throws IllegalAccessException {
//     System.out.println("Inside throwOne.");
//     throw new IllegalAccessException("demo");
//   }
//   public static void main(String args[]) {
//     try {
//       throwOne();
//     } catch (IllegalAccessException e) {
//       System.out.println("Caught " + e);
//     }
//   }
// }

// // listing 13
// // Demonstrate finally.
// class FinallyDemo {
//   // Throw an exception out of the method.
//   static void procA() {
//     try {
//       System.out.println("inside procA");
//       throw new RuntimeException("demo");
//     } finally {
//       System.out.println("procA's finally");
//     }
//   }

//   // Return from within a try block.
//   static void procB() {
//     try {
//       System.out.println("inside procB");
//       return;
//     } finally {
//       System.out.println("procB's finally");
//     }
//   }

//   // Execute a try block normally.
//   static void procC() {
//     try {
//       System.out.println("inside procC");
//     } finally {
//       System.out.println("procC's finally");
//     }
//   }

//   public static void main(String args[]) {
//     try {
//       procA();
//     } catch (Exception e) {
//       System.out.println("Exception caught");
//     }
//     procB();
//     procC();
//   }
// }


// // listing 14
// // This program creates a custom exception type.
// class MyException extends Exception {
//   private int detail;

//   MyException(int a) {
//     detail = a;
//   }

//   public String toString() {
//     return "MyException[" + detail + "]";
//   }
// }

// class ExceptionDemo {
//   static void compute(int a) throws MyException {
//     System.out.println("Called compute(" + a + ")");
//     if(a > 10)
//       throw new MyException(a);
//     System.out.println("Normal exit");
//   }

//   public static void main(String args[]) {
//     try {
//       compute(1);
//       compute(20);
//     } catch (MyException e) {
//       System.out.println("Caught " + e);
//     }
//   }
// }

// // listing 15
// // Demonstrate exception chaining.
// class ChainExcDemo {
//   static void demoproc() {
//     // create an exception
//     NullPointerException e = 
//       new NullPointerException("top layer");
  
//     // add a cause
//     e.initCause(new ArithmeticException("cause"));

//     throw e;
//   }

//   public static void main(String args[]) {
//     try {
//       demoproc();
//     } catch(NullPointerException e) {
//       // display top level exception
//       System.out.println("Caught: " + e);

//       // display cause exception
//       System.out.println("Original cause: " +
//                           e.getCause());
//     }
//   }
// }

// // listing 16
// // Demonstrate JDK 7's multi-catch feature.
// class MultiCatch {
//   public static void main(String args[]) {
//     int a=10, b=0;
//     int vals[] = { 1, 2, 3 };
    
//     try {
//       int result = a / b; // generate an ArithmeticException  
   
// //      vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

//       // This catch clause catches both exceptions.
//     } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
//       System.out.println("Exception caught: " + e);
//     }

//     System.out.println("After multi-catch.");
//   }
// }