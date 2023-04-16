package broCode;

import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
//import java.io.FileReader;
import java.io.IOException;
import javax.sound.sampled.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException {
		// # 1. Hello World print
		System.out.println(" # 1. Hello World print:");
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
		// # 2. data types  
		System.out.println(" # 2. data types:");
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
		System.out.println(" # 4. user input:");
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
		System.out.println(" # 7. math / random:");
		double math_x = 1;
		double math_y = 2;
		double math_z;
		double min_xy = Math.min(math_x, math_y);
		System.out.println("The min of x and y is: "+min_xy);
		/*
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
		System.out.println(" # 9. if / switch:");
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
		 System.out.println(" # 11. logical opeartors:");
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
		System.out.println(" # 12. while / for / loops:");
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
		for(int i=3; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
		 // # 15. arrays: 
		 // 	  one variable with multiple values, two ways to define an array
		 System.out.println(" # 15. arrays:");
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
		 System.out.println(" # 16. 2D arrays:");
		 String[][] cars2d = {
				 				{"01", "02", "03"},
				 				{"11", "12", "13"},
				 				{"21", "22", "23"}
				 			 };
		 for (int i=0; i < cars2d.length; i++) {
			 for (int jj=0; jj < cars2d[i].length; jj++) {
				 System.out.print(cars2d[i][jj]+" ");
			 }
		 }
		 
		 // # 17. java string methods 
		 System.out.println(" \n# 17. string methods: ");
		 String str17 = "Bro";
		 //boolean result = str17.equals("Hello");
		 //int result = str17.length();
		 //char result = str17.charAt(0);
		 //int result = str17.indexOf("o");
		 //String result = str17.toUpperCase();
		 String result = str17.replace("o", "a");
		 System.out.println("result: "+result);
			
		 // # 18. wrapper classes 
		 // 	provides a way to use primitive data types as reference data types
		 //		reference data types contain useful methods
		 //     can be used with collections (ex.ArrayList)
		 
		 //primitive  //wrapper
		 //---------  //-------
		 // boolean  	Boolean
		 // char   		Character
		 // int   		Integer
		 // double  	Double
		  
		 // autoboxing: the automatic conversion that the Java compiler makes between 
		 // 		the primitive types and their corresponding object wrapper classes
		 // unboxing: reverse of autoboxing. Automatic conversion of wrapper to primitive
		 System.out.println(" # 18 wrapper classes: ");
		 Boolean a = true;
		 Character b = '@';
		 Integer c = 123;
		 Double d = 3.14;
		 if (a==true) {
			 System.out.println("Boolean: "+a+" Character: "+b+" Integer: "+c+" Double: "+d);
		 }
		 
		 // # 19. ArrayList = 	a resize-able array. 
		 //		Elements can be added and removed after compilation phase
		 //		store reference data types
		 ArrayList<String> food = new ArrayList<String>(); 
		 food.add("apple");
		 food.add("pear");
		 food.set(0,"peach");
		 food.remove(1);
		 for (int i=0; i<food.size(); i++) {
			 System.out.println(" # 19. ArrayList: "+food.get(i));
		 }
		 
		 // # 20. 2D ArrayList
		 ArrayList<String> bakeryList = new ArrayList<String>();
		 bakeryList.add("donut");
		 bakeryList.add("crossaut");
		 ArrayList<String> drinkList = new ArrayList<String>();
		 drinkList.add("bear");
		 drinkList.add("wine");
		 
		 ArrayList<ArrayList> groceryList = new ArrayList<ArrayList>();
		 groceryList.add(bakeryList);
		 groceryList.add(drinkList);
		 System.out.println(" # 20. 2D ArrayList: "+groceryList.get(1).get(1));
		 System.out.println(groceryList);

		 // # 21. for-each = traversing technique to iterate through the elements in an array/collection
	     //				less steps, more readable vs less flexible
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		System.out.println(" # 21. for-each loop: ");
		for (String i: animals) {
			 System.out.println(i);
		}
		 
		// # 22. method = a block of code that is executed whenever it is called upon
		int x22 = 2;
		int y22 = 3;
		int z22 = add_int(x22,y22);
		System.out.println(" # 22. method: "+z22);
		 
		// # 23. overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
		int x23 = 4;
		int z23 = add_int(x22,y22,x23);
		System.out.println(" # 23. over loaded method: "+z23);
		 
		// # 24. printf() = method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		System.out.printf(" # 24. printf: %b\n",myBoolean);
		System.out.printf("%c\n",myChar);
		System.out.printf("%s\n",myString);
		System.out.printf("%d\n",myInt);
		System.out.printf("%f\n",myDouble);
		
		//[width] = minimum number of characters to be written as output
		System.out.printf("Hello %10s\n",myString);
		//[precision] = sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.1f\n",myDouble);
		// [flags] = adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("You have this much money %,f\n",myDouble);
		
		// # 25. final (= constant in Python)
		final double PI = 3.14159;
		//PI = 4;  //You can't change a final variable (use capital)
		System.out.println(" # 25 final:"+PI);
		
		// # 26. OOP
		Car myCar1 = new Car();
		System.out.println(" # 26 OOP:"+myCar1.make);
		myCar1.drive();
		
		// # 27. Constructors  = special method that is called when object is instantiated/created.
		Human human1 = new Human("Rick", 55);
		Human human2 = new Human("Morty", 66);
		System.out.println(" # 27 constructors:");
		human1.eat();
		human2.drink();

		// # 28. Local vs global
		//local =  declared inside a method,  visible only to that method
		//global  = declared outside a method, but within a class, visible to all parts of a class
		System.out.println(" # 28 local vs global:");
		DiceRoller diceRoller = new DiceRoller();
				
		// # 29. overloaded constructors 
		//Pizza myPizza1 = new Pizza("thick crust");
		Pizza myPizza1 = new Pizza("thicc crust", "tomato");
		System.out.println(" # 29 overloaded contructors: Here is your pizza ingredients ");
		System.out.println(myPizza1.bread);
		System.out.println(myPizza1.sauce);
		System.out.println(myPizza1.cheese);
		System.out.println(myPizza1.topping);
		
		// # 30. toSting 
		// special method all objects inherit, returns a string that "textually represents"
		// an object. can be used implicitly and explicitly.
		Car myCar = new Car();
		System.out.println(" # 30 toString: "+myCar);

		// # 31 array of objects
		Food food1 = new Food("burger");
		Food food2 = new Food("pasta");
		Food[] refrigerator = {food1, food2};
		// Food refrigerator[] = {food1, food2}; //  also works
		System.out.println(" # 31 array of objects: "+refrigerator[0].name+' '+refrigerator[1].name);

		// # 32 object passing 
		System.out.println(" # 32 object passing: ");
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

		// # 34 inheritance =	one class acquires attributes/methods of another.
		// 		ex.  vehicle(move/stop) --- car(wheel/door)
		//                         |--------bike(wheel/pedal)
		Car34 car34 = new Car34();
		Bike34 bike34 = new Bike34();
		System.out.println(" # 34 inheritance:");
		System.out.println("car has "+car34.doors+" doors");
		System.out.println("bike has "+bike34.pedals+" pedals");
		car34.move();
		bike34.stop();
	
		// # 35 method overriding  = 	declaring a method in sub class, which is already present in parent class.
		//		done so that a child class can give its own implementation
		System.out.println(" # 35 method overriding:");
		car34.speed(); 
		bike34.speed(); // overriding happens

		// # 36 super keyword 	= refers to superclass/parent of an object, similar to "this"
		System.out.println(" # 36 super keyword:");
		Hero hero1 = new Hero("batman",43,"$$$");
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);

		Hero hero2 = new Hero("superman",34,"everything");
		System.out.println(hero2.toString());
		
		// # 37 abstract = can't be instantiated, but can have a subclass
		//			abstract methods are declared without an implementation 
		System.out.println(" # 37 abstract:");
		Car37 car37 = new Car37();
		car37.go();
		
		// # 38 access modifiers 
		//public: visible in all classes in all packages
		//protected: visible to all classes in the same package or classes in other packages that are a subclass
		//default: visible to all classes in the same package 
		//private: visible only in the same class
		//         package1 ---- A.java 
		//	          |--------- B.java 
		//         package2 ---- C.java 
		//	          |--------- Asub.java 
		System.out.println(" # 38 access modifiers:");

		// # 39 encapsulation
		// attributes of a class should be hidden or private
		// can be accessed only through methods (getters & setters)
		System.out.println(" # 39 encapsulation:");
		Car39 car1 = new Car39("BMW");
		System.out.println(car1.getMake());
		car1.setMake("Benz");
		System.out.println(car1.getMake());

		// # 40 copy object < method 1
		System.out.println(" # 40. copy object: method1");
		Car39 car3 = new Car39("Fiat");
		Car39 car4 = new Car39("Volvo");
		System.out.println(car3+"\n"+car4);
		System.out.println(car3.getMake()+"\n"+car4.getMake());
		// car4 = car3;
		// System.out.println("\n"+car3+"\n"+car4);  // return same addr
		car4.copy(car3);
		System.out.println("\n"+car3+"\n"+car4);
		System.out.println(car3.getMake()+"\n"+car4.getMake());

		// copy object < method 2
		System.out.println(" # copy object: method2");
		Car40 car5 = new Car40("Fiat");
		Car40 car6 = new Car40(car5);
		System.out.println(car5+"\n"+car6);
		System.out.println(car5.getMake()+"\n"+car6.getMake());
		
		// # 41 Interface	=	template that class has/must do, similar to inheritance. 
		//             Fish
		//              |       
		// interfaces: prey --------- Rabbit
        //             predator ----- Hawk	
        //              |
		//             Fish
		System.out.println(" # 41 interface:");
		Hawk hawk = new Hawk();
		Rabbit rabbit = new Rabbit();
		Fish fish = new Fish();
		hawk.hunt();
		rabbit.flee();
		fish.hunt();
		fish.flee();
		
		// # 42 polymorphism (many forms): ability of an object to identify as more than one type
		//      e.g. a boat is boat & vehicle & object 
		System.out.println(" # 42 polymorphism: ");
		Boat42 boat = new Boat42();
		Vehicle37[] racers = {car37,boat};
		for(Vehicle37 x42 : racers) {
					x42.go();
		}
	
		// # 43 dynamic polymorphism 
		System.out.println(" # 43 dynmamic polymorphism: ");
		//      dynamic = after compilation (during runtime)
		/*
		System.out.println(" # 43 dynamic polymorphism: ");
		Scanner scanner43 = new Scanner(System.in);
		Animal animal;
		System.out.println("What animal do you want? 1=dog, 2=cat");
		int choice = scanner43.nextInt();
		if (choice==1) {
			animal = new Dog();
			animal.sound();
		}
		else if(choice==2){
			animal = new Cat();
			animal.sound();
		}
		else {
			System.out.println("Invalid choice");
		}
		*/
		
		// # 44 exception handling 
		System.out.println(" # 44 exception handling : ");
		//		event that occurs during execution of program, 
		//      disrupts normal flow of instructions
		/*
		Scanner scanner44 = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number to divide: ");
			int x44 = scanner44.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int y44 = scanner44.nextInt();
			int z44 = x44/y44;
			System.out.println("result: " + z44); 
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!"); }
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");  }
		catch(Exception e) {
			System.out.println("Something went wrong"); }
		finally {
			scanner44.close(); 	}
		*/
	
		// # 45 file class
		// file = An abstract representation of file and directory pathname
		System.out.println(" # 45. file class:");
		File file = new File("C:/DumpStack.log");
		if(file.exists()) {
			System.out.println("That file exists! :O!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}
		else {
			System.out.println("That file doesn't exist :(");
		}  
		  
		// # 46 file writer  (considered as dangerous action > use try & catch)
		System.out.println(" # 46. file writter");
		try {
			FileWriter writer = new FileWriter("res/poem.txt");
			writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by Bro)");
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
			
		// # 47 file reader 
		// 		read the contents of a file as a stream of characters. 
		//read() returns an int value which contains the byte value
		//when read() returns -1, there is no more data to be read
 		System.out.println(" # 47. file reader");
		// TODO verify why can't import FileReader
 		/*    
 		try {
			FileReader reader = new FileReader("res/poem.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		} 
		catch (FileNotFoundException e) {
			   e.printStackTrace();     } 
		catch (IOException e) {
			   e.printStackTrace();  }
		*/
		
		// # 48 audio
 		System.out.println(" # 48. audio:");
		Scanner scanner48 = new Scanner(System.in);
		File file48 = new File("res/Fine_Dining.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file48);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
	
		String response = "";
		while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");
		
			response = scanner48.next();
			response = response.toUpperCase();
			switch(response) {
				case ("P"): clip.start();
			  		break;
			  	case ("S"): clip.stop();
			  		break;
			  	case ("R"): clip.setMicrosecondPosition(0);
			  		break;
			  	case ("Q"): clip.close();
			  		break;
			  	default: System.out.println("Not a valid response");
			}
		  }
		  System.out.println("Byeeee!"); 
	}
	
	static int add_int(int a, int b) {
		System.out.println("\n # overloaded method #1");
		return a+b;
	}
	
	static int add_int(int a, int b, int c) {
		System.out.println("\n # overloaded method #2");
		return a+b+c;
	}
	
	// ******************************************************************************

}


		  
