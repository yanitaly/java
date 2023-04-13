package broCode;

public class Human {
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void eat(){
		System.out.println(this.name+" is eating.");
	}
	void drink(){
		System.out.println(this.name+" is drinking.");
	}
}
