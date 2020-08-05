package AnimalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Animal Kingdom App");

        Mammals m1 = new Mammals("Panda", 1869);
        Mammals m2 = new Mammals("Zebra", 1778);
        Mammals m3 = new Mammals("Koala", 1816);

        Birds b1 = new Birds("Pigeon", 1837);
        Birds b2 = new Birds("Peacock", 1821);

        Fish f1 = new Fish("Salmon", 1758);
        Fish f2 = new Fish("Catfish", 1817);
        Fish f3 = new Fish("Perch", 1758);

        List<AbstractAnimals> mylist = new ArrayList<>();
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);
        mylist.add(b1);
        mylist.add(b2);
        mylist.add(f1);
        mylist.add(f2);
        mylist.add(f3);

        System.out.println();
        System.out.println(mylist);
    }
}