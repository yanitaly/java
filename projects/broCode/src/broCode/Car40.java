package broCode;

public class Car40 {
	private String make;
	
	Car40(String make){
		this.setMake(make);
	}
	
	Car40(Car40 x){
		this.copy(x);
	}
	public String getMake(){
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public void copy(Car40 x) {
		setMake(x.getMake());
	}
}
