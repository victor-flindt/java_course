package ugeseddel07;

/* Skeleton for the exercise */

public class FirstClass {
	private String name;
	private int id; 

	public static void main(String args[]){

		FirstClass fc1 = new FirstClass("bla",32);
		FirstClass fc2 = new FirstClass("blu",42);
		FirstClass fc3 = new FirstClass("bli",52);
		System.out.println(fc3.toString());
		System.out.println(fc2.toString());
		System.out.println(fc1.toString());
	

	}

	//Contructor
	public FirstClass(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	// Method
	
	public String toString() {

		return (id + " - "+ name);

	}
	
}
