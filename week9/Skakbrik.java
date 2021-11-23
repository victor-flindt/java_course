public abstract class Skakbrik{
	int x;
	int y;
	String color; 
	String type; 


	// Constructor
    // default constructor 

    public Skakbrik(){

    } 

	public Skakbrik(char x, int y, String color, String type){

		this.x=x;
		this.y=y;
		this.color = color;
		this.type = type; 
	}

    // regular methods

    public String toString()
    {
        x = 
        y += 1;
        return color+" "+type+" "+x+y;
    }


	// abstract methods
}