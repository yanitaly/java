package javaFundamental_p2;

import java.util.HashMap;
import java.util.Scanner;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// # 73. method chaining =  a common syntax for invoking multiple method calls in OOP
		//      condense code into less lines
		System.out.println(" # 73. metho chaning: ");
		String name = "      bro";
		//name = name.concat(" code   ");
		//name = name.toUpperCase();
		//name = name.trim();
		name = name.concat("code").toUpperCase().trim();
		System.out.println(name);
		
		//74. enum = enumerated (ordered listing of items in a collection)
		//grouping of constants that behave similarly to objects
		System.out.println(" # 74. enum: ");
		Planet myPlant = Planet.EARTH;
		canLiveHere(myPlant);
		
		//75. hashmap
		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class
		// ex: (name,email),(username,userID),(country,capital)
		System.out.println(" # 75. hash maps: ");
		HashMap<String,String> countries = new HashMap<String,String>();
		
		//add a key and value
		countries.put("USA","Washington DC");
		countries.put("India","New Delhi");
		countries.put("Russia","Moscow");
		countries.put("China","Beijing");
		
		System.out.println(countries);
		countries.remove("USA");
		System.out.println(countries.get("Russia"));
		//countries.clear();
		System.out.println(countries.size());
		//countries.replace("USA", "Detroit");
		System.out.print(countries.containsKey("England")+"\n");
		//System.out.print(countries.containsValue("Beijing"));
		
		for(String i : countries.keySet()) {
			System.out.print(i+"\t"+"= ");
			System.out.println(countries.get(i));
		}
		
		// # 76. custom exceptions
		System.out.println(" # 76: custom exception: ");
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
	 
	    try{  
	    	  checkAge(age);  
	    }
	    catch(Exception e)
	      {
	    	  System.out.println("A problem occured: "+e);
	    }   
	    */
	 				
		// # 77. anonymous objects
		//use new JFrame() iso JFrame frame = new JFrame();
		System.out.println(" # 77. anonymous objects");
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*
		ImageIcon AC = new ImageIcon("src\\cards\\1.png");
		JLabel AClabel = new JLabel(AC);
		deck.add(AClabel);
		
		ImageIcon TwoC = new ImageIcon("src\\cards\\2.png");
		JLabel TwoClabel = new JLabel(TwoC);
		deck.add(TwoClabel);
		
		... repeat for all 52 cards :(
		*/
		
		for(int i =1;i<=3;i++) {
			deck.add(new JLabel(new ImageIcon("res/minion"+i+".png")));
			frame.add(deck.get(i-1));
		}
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
		// # 78. inner classes
		System.out.println(" # 78. inner classes ");
		/* inner class = 	A class inside of another class.
		useful if a class should be limited in scope. 
		usually private, but not necessary
		helps group classes that belong together
		extremely useful for listeners for specific events
		precursor for anonymous inner classes			
		*/
		Outside out = new Outside();
		Outside.Inside in = out.new Inside();
		System.out.println(out.x+in.y);
		in.Greeting();

		// # 79. anonymous inner class
		  /*anonymous class = an inner class without a name
        only a single object is created from one
       The object may have “extras” or "changes"
      and no need to create a separate inner class
      when it only need it once.
      Helps us to avoid cluttering code with a class name

      Syntax is similar to a constructor,
       except that there is also a class definition
       within a block of code.  
       GREAT FOR LISTENERS
       */
		System.out.println(" # 79. annoymous inner class");
		Greeting greeting = new Greeting() {
			public void Welcome()
			{
				System.out.println("Hello world_new!");
			}
		};
		greeting.Welcome();
		Greeting greeting2 = new Greeting();
		greeting2.Welcome();
		
		// ex.2 3 buttons with different actions
		MyFrameAnonymousInnerClass myFrame = new MyFrameAnonymousInnerClass();


		
		/*
		 * {

			@Override
			public void Welcome() {
				System.out.println("Hello World v2");
			}
		}
		Greeting greeting2 = new Greeting();
		greeting2.Greeting();
		*/
		// 80. lambda 
		System.out.println(" # 8: ");

		// 81. generics 
		System.out.println(" # 8: ");

		// 82. serialization
		System.out.println(" # 8: ");
		
		// 83. timer task
		System.out.println(" # 8: ");

		
		// 84. threads
		System.out.println(" # 8: ");

		// 85. multi-threading 
		System.out.println(" # 8: ");
		
		// 86. packages 
		System.out.println(" # 8: ");

		// 87. compile and run with cmd prompt
		System.out.println(" # 8: ");

		// 88. executable
		
		// 89. encryption program
		
		// 90. text editor app 
		


		
		
		
	}

	
	
	
	static void canLiveHere(Planet myPlanet) {
		switch(myPlanet) {
		case EARTH:
			System.out.println("You can live here :)");
			System.out.println("This is planet #"+myPlanet.number);
			break;
		default:
			System.out.println("You can't live here...yet");
			System.out.println("This is planet #"+myPlanet.number);
			break;
		}
	}
	
	static void checkAge(int age)throws AgeException{ 
	     if(age<18) {
	    	 throw new AgeException("\n"+"You must be 18+ to sign up");  
	     }
	     else {
	    	 System.out.println("You are now signed up!"); 
	     }       
}

}
