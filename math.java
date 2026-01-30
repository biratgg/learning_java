// public class math {
//     public static void main(String[] arg){
//         System.out.println(Math.max(5,9));
//         System.out.println(Math.min(5,9));
//         System.out.println(Math.pow(5,2));
//         System.out.println(Math.ceil(5.6));
//         System.out.println(Math.floor(5.6));
//         System.out.println(Math.round(5.6));
//         System.out.println((int)(Math.random()*100))
//     }
    
// }

// public class math{
//     public static void main(String[] arg){
//         int x=7,y=9;
//         System.out.println(x>y); //boolean variable = true/false
//     }
// }
//LOOPS
// public class math{
//     public static void main(String[] arg){
//         int x=9,y=7;
//         if(x>y){
//             System.out.println("x is greater than y");
//         }
//         else {
//             System.out.println("y is greater than x");
//         }
//     }
// }
// use of boolean in if else
// public class math{
//     public static void main(String[] arg){
//         boolean isRaining = false;
//         if(isRaining){
//             System.out.println("please carry an umbrella");

//         }
//         else{
//             System.out.println("there will be no rain today");
//         }
//     }
// }
// public class math{
//     public static void main(String[] arg){
//         String weather="sunny";
//         if (weather=="rainy"){
//             System.out.println("please carry an umbrella");
//         }
//         else if(weather=="sunny"){
//             System.out.println("wear a hat");
//         }
//         else{
//             System.out.println("wear warm clothes");
//         }
//         }   
//     }
// public class math{
//     public static void main(String[] arg){
//         int price=10;
//         System.out.println(( price>15)? "too expensive" : " affordable");

//     }
// }
// 
// public class math{
//     public static void main(String[] arg)
//     {
//         int weight=100;   also do{} while(condition);
//         while(weight>90){
//             System.out.println("fat boy");
//             weight-=1;
//         }
//     }
// }
//for loop- for(condition){}
// public class math{
//     public static void main(String[] arg){
//         for (int i=1;i<=5;i++){
//             System.out.println("hello world"+ i);
//         }
        
//     }
// } 
// break and continue in java:
//break:terminates the loop
//continue:skips the current iteration and continues with the next iteration
//to make an array, use datatype[] variable_name={"...","...","..."};
// array starts fro index 0 to length-1
// public class math{    
//     public static void main(String[] arg){
//         String[] students={"birat","ankit","biplob","batsal"};   
//         for (int i=0;i<students.length;i++){
//             System.out.println(students[i]);
//         }
//     }

// }
// public class math{    
//     public static void main(String[] arg){
//         String[] students=new String[]{"birat","ankit","biplob","batsal"};   
//         for (int i=0;i<students.length;i++){
//             System.out.println(students[i]);
//         }
//     }
//new keyword is used to create array of a fixed length
// }
// public class math{    
//     public static void main(String[] arg){
//         String[] students=new String[4];  //or String[] students=new String[]{"birat","ankit","biplob","batsal"};
//         students[0]="birat";
//         students[1]="ankit";
//         students[2]="biplob";
//         students[3]="batsal";
//         for (int i=0;i<students.length;i++){
//             System.out.println(students[i]);
//         }
//     }
// }
//looping in array
// for (type variable : arrayname) {
//   // code block to be executed
// }
// public class math{    
//     public static void main(String[] arg){
//          String[] students=new String[]{"birat","ankit","biplob","batsal"};
        
//          for (String stu: students){
//             System.out.println(stu);
//          }
        
//     }
// }
//multidimensional array int[][] can be used as vectors
// public class math{
//     public static void main(String[] arg){
//         int[][] num={{1,2,3},{4,5,6}};
//         for(int numm[]:num){
//             for(int n:numm){
//                 System.out.println(n);
//             }
//         }
//     }
// }