// public class method {
//   static void myMethod() {
//     System.out.println("I just got executed!");
//   }

//   public static void main(String[] args) {
//     myMethod();
//     myMethod();
//     myMethod();
//   }
// }
//PARAMETERS
// public class method{
//     static void add(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] arg){
//         add(10,5);
//         add( 6,6);
//     }
// }
// public class method{
//     static void name(String naam,String position){
//         System.out.println("my name is "+ naam+" and my position is " + position);
//     }
//     public static void main(String[] arg){
//         name("ankit","Trainee");
//         name("birat","Intern");
//     }
// }
//return values
// public class method{
//     static int add(int a, int b){
//         return(a+b);
//     }
//     public static void main(String[] arg){
//         int result=add(5,7);
//         System.out.println(result);
//     }
// }
//method overloading-method with same name but does different tasks
// public class method{
//     static int add(int a, int b){
//         return(a+b);
//     }
//     static double add(double a, double b){
//         return(a+b);
//     }
//     public static void main(String[] arg){
//         int result1=add(5,7);
//         double result2=add(5.5,7.3);
//         System.out.println(result1);
//         System.out.println(result2);
//     }
// }
//score-> variables that are only accessible withing a method   
//block scope-> variables that are only accessible within a block{} inside a method(similar to method but defined withing curly brackets)
//loop scope-> defined only within a loop life for(int i=0;i<10;i++){}
//recursion-> when a method calls itself 