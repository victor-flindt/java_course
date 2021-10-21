package ugeseddel07;

/* Skeleton for the exercise */

public class FirstClass {
	private String name;
	private int id; 
	// using array list instead of array because "java"
	// List<FirstClass> cat_register = new ArrayList <FirstClass>();
	public static void main(String args[]){

		FirstClass fc1 = new FirstClass("bla",32);
		fc1.firstclass_idmutator(99);
		fc1.firstclass_namemutator("haha");

		System.out.println(fc1.firstclass_id());
       fe  fe 
	}
								// Contructor
	public FirstClass(String name, int id){
		this.name = name;
		this.id = id;
	}
								// Methods //
	
	// To string
	public String toString() {
		return (id + " - "+ name);
	}

	// Obejct register of 10 cats 

	// public add_cat(FirstClass object){
	// 	cat_register.add(object);
	// }

	// Mutators // 
	public void firstclass_namemutator(String new_name){
		this.name=new_name; 
	}
	public void firstclass_idmutator(int new_id){
		this.id=new_id;
	}
								// Accesors //
	public String firstclass_name(){
		return name; 
	}
	public int firstclass_id(){
		return id;
	}

}
