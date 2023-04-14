package broCode;

import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello world\n");  // \n for line break
		System.out.println("Hello world");  // add line break
		System.out.println("\tHello world\n");  // \t for tab 
		System.out.println("Hello world");
		System.out.println("\"Hello world\"");
	
		/*
		 * This
		 * is 
		 * multiple-line
		 * comment
		 */
		
		int x;
		x = 123;
		long y = 1233333333333333L;
		System.out.println("My number is: "+y);
		float z = 3.14f;
		double j = 3.14;
		boolean h = true;
		char symbol = '@';
		String nameb = "Bro";
		System.out.println("My name is: "+nameb+" and symbol is: "+symbol);
				
		// # 4. user input	
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is ur name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is ur favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("Your favorite food is "+food);
		*/
		
		// # 5. expressions 
		// expression =     operands & operators
		// operands =  values, variables, numbers, quantity
		// operators = + - * / % 
		
		// # 6. GUI 
		/*
		String gui_name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null,"Hello "+gui_name);
		int gui_age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		JOptionPane.showMessageDialog(null,"Your age is "+gui_age);
		*/
		
		// # 7. math /  random nr
		/*
		double math_x = 1;
		double math_y = 2;
		double math_z;
		  
		double min_xy = Math.min(math_x, math_y);
		System.out.println("The min of x and y is: "+min_xy);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		math_x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		math_y = scanner.nextDouble();
		  
		math_z = Math.sqrt((math_x*math_x)+(math_y*math_y));
		System.out.println("The hypotenuse is : "+math_z);
		scanner.close();   
		*/

		Random random = new Random();
		int rx = random.nextInt(6)+1;
		System.out.println("Random integer is: "+rx);
		
		// # 9. if / switch 
		int age = 55;
		
		if(age==75) {
			System.out.println("Ok Boomer!");
		}
		else if(age>=18) {
			System.out.println("You are an adult!");
		}
		else if(age>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
		
		 // switch = statement that allows a variable to be tested for equality against a list of values
		 String day = "Friday";
		 switch(day) {
		   case "Sunday": System.out.println("It is Sunday!");
		   break;
		   case "Monday": System.out.println("It is Monday!");
		   break;
		   case "Tuesday": System.out.println("It is Tuesday!");
		   break;
		   case "Wednesday": System.out.println("It is Wednesday!");
		   break;
		   case "Thursday": System.out.println("It is Thursday!");
		   break;
		   case "Friday": System.out.println("It is Friday!");
		   break;
		   case "Saturday": System.out.println("It is Saturday!");
		   break;
		   default: System.out.println("That is not a day!");
		}
		 
		 
		// # 11. logical operators
		// logical operators = used to connect two or more expressions
			//
			//						&& = (AND) both conditions must be true
			// 						|| = (OR) either condition must be true
			//						! = (NOT) reverses boolean value of condition

		 // -------------------------------- Example 1 --------------------------------
		 int temp = 15;
		 if(temp>30) {
			System.out.println("It is hot outside");
			}
		 else if(temp>=20 && temp<=30) {
				System.out.println("It is warm outside");
			}
		 else {
				System.out.println("It is cold outside");
			}

		 // -------------------------------- Example 2 --------------------------------
		 /*
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game");
		}
		scanner.close();
		*/
		
		// # 12. while / for / nested loop
		 /*
		// while loop = executes a block of code as long as a it's condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
		   System.out.print("Enter your name: ");
		   name = scanner.nextLine();
		}
		System.out.println("Hello "+name);
		scanner.close();
		*/
		
		// for loop = executes a block of code a limited amount of times
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
		 // # 15. arrays: one variable with multiple values.  
		 // two ways defining an arrary
	     // use for loop to print all elements
		 String[] cars = {"tesla", "bmw", "fiat"};
		 System.out.println(cars[0]);
		 cars[0] = "farrari";
		 System.out.println(cars[0]+"\n");
		 
		 String[] autos = new String[3];
		 autos[0] = "farrari1";
		 autos[1] = "farrari2";
		 autos[2] = "farrari3";
		 for (int i=0; i<3; i++){
			 System.out.println(autos[i]);
		 }
		 
		 // # 16. 2D arrays = arrays of arrays.  
		 String[][] cars2d = {
				 				{"01", "02", "03"},
				 				{"11", "12", "13"},
				 				{"21", "22", "23"}
				 			 };
		 for (int i=0; i < cars2d.length; i++) {
			 System.out.print("\n");
			 for (int jj=0; jj < cars2d[i].length; jj++) {
				 System.out.print(cars2d[i][jj]+" ");
			 }
		 }
		 
		 // # 17. java string methods 
		 String str17 = "Bro";
		 //boolean result = str17.equals("Hello");
		 //int result = str17.length();
		 //char result = str17.charAt(0);
		 //int result = str17.indexOf("o");
		 //String result = str17.toUpperCase();
		 String result = str17.replace("o", "a");
		 System.out.println("\n# 17 str: "+result);
			
		 // # 18. wrapper classes 
		 // wrapper class =  provides a way to use primitive data types as reference data types
		 //     reference data types contain useful methods
		 //     can be used with collections (ex.ArrayList)
		  
		 //primitive  //wrapper
		 //---------  //-------
		 // boolean  	Boolean
		 // char   	Character
		 // int   		Integer
		 // double  	Double
		  
		 // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
		 // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		  
		 Boolean a = true;
		 Character b = '@';
		 Integer c = 123;
		 Double d = 3.14;
		 if (a==true) {
			 System.out.println("\n # 18 wrapper class: "+a);
		 }
		 
		 // # 19. ArrayList = 	a resize-able array. 
		 //				Elements can be added and removed after compilation phase
		 //				store reference data types
		 ArrayList<String> food = new ArrayList<String>(); 
		 food.add("apple");
		 food.add("pear");
		 food.set(0,"peach");
		 food.remove(1);
		 for (int i=0; i<food.size(); i++) {
			 System.out.println("\n # 19. ArrayList: "+food.get(i));
		 }
		 
		 // # 20. 2D ArrayList
		 ArrayList<ArrayList> groceryList = new ArrayList<ArrayList>();

		 ArrayList<String> bakeryList = new ArrayList<String>();
		 bakeryList.add("donut");
		 bakeryList.add("crossaut");
		 
		 ArrayList<String> drinkList = new ArrayList<String>();
		 drinkList.add("bear");
		 drinkList.add("wine");
		 
		 groceryList.add(bakeryList);
		 groceryList.add(drinkList);
		 System.out.println("\n # 20. 2D ArrayList: "+groceryList.get(1).get(1));
		 System.out.println(groceryList);

		 // # 21. for-each = 	traversing technique to iterate through the elements in an array/collection
	     //				less steps, more readable
		 //				less flexible
			
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		System.out.println("\n # 21. for-each loop: ");
		for (String i: animals) {
			 System.out.println(i);
		}
		 
		// # 22. method = a block of code that is executed whenever it is called upon
		int x22 = 2;
		int y22 = 3;
		int z22 = add_int(x22,y22);
		System.out.println("\n # 22. method: "+z22);
		 
		// # 23. overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		int x23 = 4;
		int z23 = add_int(x22,y22, x23);
		System.out.println("\n # 23. over loaded method: "+z23);
		 
		// # 24. printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		System.out.printf("\n # 24. printf: %b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("You have this much money %,f",myDouble);
		
		// # 25. final 
		final double PI = 3.14159;
		//PI = 4;  //You can't change a final variable (use capital)
		System.out.println("\n # 25 final:"+PI);
		
		// # 26. OOP
		Car myCar1 = new Car();
		System.out.println("\n # 26 OOP:"+myCar1.make);
		myCar1.drive();
		
		// # 27. Constructors 
		// constructor = special method that is called when object is instantiated/created.
		Human human1 = new Human("Rick", 55);
		Human human2 = new Human("Morty", 66);
		System.out.println("\n # 27 constructors:");
		human1.eat();
		human2.drink();

		// # 28. local global
		//local =  declared inside a method
		//   visible only to that method
		//global  = declared outside a method, but within a class
		//   visible to all parts of a class
		System.out.println("\n # 28 local vs global variables:");
		DiceRoller diceRoller = new DiceRoller();
				
		// # 29. overloaded contructors 
		//Pizza myPizza1 = new Pizza("thicc crust");
		Pizza myPizza1 = new Pizza("thicc crust", "tomato");
		System.out.println("\n # 29 overloaded contructors: Here is your pizza ingredients ");
		System.out.println(myPizza1.bread);
		System.out.println(myPizza1.sauce);
		System.out.println(myPizza1.cheese);
		System.out.println(myPizza1.topping);
		
		// # 30. toSting 
		Car myCar = new Car();
		System.out.println("\n # 30 toString: "+myCar);

		// # 31 array of objects
		Food food1 = new Food("burger");
		Food food2 = new Food("pasta");
		Food[] refrigerator = {food1, food2};
		System.out.println("\n # 31 array of objects: "+refrigerator[0].name+' '+refrigerator[1].name);

		// # 32 object passing 
		System.out.println("\n # 32 object passing: ");

		Garage garage = new Garage();
		Auto auto1 = new Auto("BMW");
		Auto auto2 = new Auto("Benz");
		garage.park(auto1);
		garage.park(auto2);

		
		// # 33  static keyword
		// 		static = modifier. A single copy of a variable/method is created and shared.
		//		The class "owns" the static member. ex. all Friend instances share friendsCount
		Friend friend1 = new Friend("Rick");
		Friend friend2 = new Friend("Morty");
		System.out.println("\n # 33  static keyword: "+Friend.friendsCount);

		// # 34 inheritance
		// 		one class acquires attributes/methods of another.
		// 		ex.  vehicle(move/stop) --- car(wheel/door)
		//                   |--------bike(wheel/pedal)
		
		Vehicle34 vehicle = new Vehicle34();
		Car34 car34 = new Car34();
		Bike34 bike34 = new Bike34();
		System.out.println(" # 34 inheritance:");
		System.out.println("car has "+car34.doors+" doors");
		System.out.println("bike has "+bike34.pedals+" pedals");
		car34.move();
		bike34.stop();
	
		// # 35 method overriding 
		// 		Declaring a method in sub class, which is already present in parent class.
		//		done so that a child class can give its own implementation
		System.out.println(" # 35 method overriding:");
		car34.speed(); 
		bike34.speed(); // overiding happens

		// # 36 super keyword
		// 		refers to superclass/parent of an object, similar to "this"
		System.out.println(" # 36 super keyword:");
		Hero hero1 = new Hero("batman",43,"$$$");
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);

		Hero hero2 = new Hero("superman",34,"everything");
		System.out.println(hero2.toString());
		
		// # 37 abstract 
		System.out.println(" # 37 abstract:");
		Car37 car37 = new Car37();
		car37.go();
		
		// # 38 access modifiers: (public, protected, private) 
		//public: visible in all classes in all packages
		//protected: visible to all classes in the same package or classes in other packages that are a subclass
		//default: visible to all classes in the same package 
		//private: visible only in the same class
		
		
		// # 39 encapsulation
		
		// # 40 copy object
		
		
		
	}
	

	static int add_int(int a, int b) {
		System.out.println("\n # overloaded method #1");
		return a+b;
	}
	
	static int add_int(int a, int b, int c) {
		System.out.println("\n # overloaded method #2");
		return a+b+c;
	}
	
	
}


		  
