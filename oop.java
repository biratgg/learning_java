//class is an templete/ blueprint for an object
//object is an instance of a class

// public class oop{
//     int a=5;
//     String name="birat thapa";
//     public static void main(String[] arg){
//         oop obj= new oop();
//         System.out.println("My name is "+obj.name+ obj.a);
//     }
// }
//only one class can be public in a java file and the name of the file must be the same as the public class name
//following code will extract name and age from another class named obj
// public class oop{
//     int a=5;
//     String name="birat thapa";
//     public static void main(String[] arg){
//       obj object= new obj();
//         System.out.println("My name is "+object.name+ object.age);
//     }
// }
// Create a Main class
// Create a Main class
// public class oop {
 
//   // Create a fullThrottle() method
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   }

//   // Create a speed() method and add a parameter
//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   }

//   // Inside main, call the methods on the myCar object
//   public static void main(String[] args) {
//     oop myCar = new oop();   // Create a myCar object because the methods are not static. 
// //static keyword makes the method belong to the class and not the object. so we don;t need an object to access it.
//     myCar.fullThrottle();      // Call the fullThrottle() method
//     myCar.speed(200);          // Call the speed() method
//   }
// }
//constructor in java is used to initialize values for object or attribute when an object is created
//Note that the constructor name must match the class name, and it cannot have a return type like void. constructor is a method
// public class oop{
//     int x;
//     //constructor
//     public oop(){
//         x=10;
//     }
//     public static void main(String[] arg){
//         oop obj=new  oop();
//         System.out.println(obj.x);
//     }
// }
// constructors can have parameters too
// public class oop{
//     int x;
//     //constructor
//     public oop(int val){
//         x=val;
//     }
//     public static void main(String[] arg){
//         oop obj=new  oop(10);
//         System.out.println(obj.x);
//     }
// }
//THIS KEYWORD IN JAVA
// public class oop {
//   int x;  // Class variable x

//   // Constructor with one parameter x
//   public oop(int x) {
//     this.x = x; // refers to the class variable x
//   }

//   public static void main(String[] args) {
//     // Create an object of oop and pass the value 5 to the constructor
//     oop myObj = new oop(5);
//     System.out.println("Value of x = " + myObj.x);
//   }
// }
//MODIFIERS in java
//access modifers-public, private, protected, default
//non-access modifers-static, final, abstract, synchronized, etc
//encapsulation in java-data is hidden and can be accessed only through methods of the class
//inheritance
// class Vehicle {
//   protected String brand = "Ford";
//   public void honk() {
//     System.out.println("Tuut, tuut!");
//   }
// }

// class Car extends Vehicle {
//   private String modelName = "Mustang";
//   public static void main(String[] args) {
//     Car myFastCar = new Car();
//     myFastCar.honk();
//     System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//   }
// }
// class Animal {
//   public void animalSound() {
//     System.out.println("The animal makes a sound");
//   }
// }

// class Pig extends Animal {
//   public void animalSound() {
//     System.out.println("The pig says: wee wee");
//   }
// }

// class Dog extends Animal {
//   public void animalSound() {
//     System.out.println("The dog says: bow wow");
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     Animal myAnimal = new Animal();  // Create a Animal object
//     Animal myPig = new Pig();  // Create a Pig object
//     Animal myDog = new Dog();  // Create a Dog object
//     myAnimal.animalSound();
//     myPig.animalSound();
//     myDog.animalSound();
//   }
// }
//super keyword is used to refer to the parent class object and access its members
//same name xa tara child class ko method vitra bata parent class ko method call garna super keyword use garincha
// class Animal {
//   public void animalSound() {
//     System.out.println("The animal makes a sound");
//   }
// }

// class Pig extends Animal {
//   public void animalSound() {
//     super.animalSound(); // Call the parent class method
//     System.out.println("The pig says: wee wee");
//   }
// }
//inner class means a class inside another class. to access. you need to make an object for both wouter main class and 
//inner class
// class outer{
//     int x=10;
//     class inner{
//         int y=3;

//     }

// }
// class obj{
//     public static void main(String[] arg){
//         outer obj1=new outer();
//         outer.inner obj2=obj1.new inner();
//         System.out.println(obj1.x+obj2.y);
//     }
// }