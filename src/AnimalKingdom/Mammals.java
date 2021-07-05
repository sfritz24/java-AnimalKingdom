package AnimalKingdom;

public class Mammals extends AbstractAnimals
{
    private String moves;
    private String breathes;
    private String reproduce;

    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
        moves = "walks";
        breathes = "lungs";
        reproduce = "live births";
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    @Override
    public String getMoves()
    {
        return moves;
    }

    @Override
    public String getBreathes()
    {
        return breathes;
    }

    @Override
    public String getReproduce()
    {
        return reproduce;
    }

    @Override
    public String toString()
    {
        return name + " " + id + " " + moves + " " + breathes + " " + reproduce + " " + yearDiscovered;
    }
}