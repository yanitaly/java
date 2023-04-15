package broCode;

public class Car39 {
	private String make;
	
	Car39(String make){
		this.setMake(make);
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public void copy(Car39 x) {
		this.setMake(x.getMake());
	}
	
}
