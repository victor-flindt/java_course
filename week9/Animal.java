public class Animal
{
    private int legs;
    private boolean laysEggs;
    private String name;
    public Animal(){
    }
    // constructor
    public Animal(int legs, boolean laysEggs, String name)
    {
        this.name = name;
        this.laysEggs = laysEggs;
        this.legs = legs;
    }

    public int getLegs()
    {
        return legs;
    }

    public boolean laysEggs()
    {
        return laysEggs;
    }

    public String toString()
    {
        return name;
    }
}


