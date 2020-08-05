package AnimalKingdom;

abstract class AbstractAnimals
{
    protected static int maxId = 0;
    protected int id;
    protected boolean eats;
    protected String name;
    protected int yearDiscovered;

    public AbstractAnimals(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;
        eats = true;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    abstract int getId();
    abstract String getName();
    abstract int getYearDiscovered();
    abstract String getMoves();
    abstract String getBreathes();
    abstract String getReproduce();
}