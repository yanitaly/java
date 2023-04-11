import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=xk4_1vDrzzo&t=379s
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
		
		
		 // # 15. arrays
		 
		 
		 
		 
		 
	}
}
		  
