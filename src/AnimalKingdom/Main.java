package AnimalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<AbstractAnimals> filterAnimals(List<AbstractAnimals> animal, CheckAnimal tester)
    {
        List<AbstractAnimals> templist = new ArrayList<>();

        for (AbstractAnimals a : animal)
        {
            if (tester.test(a))
            {
                templist.add(a);
            }
        }

        return templist;
    }

    public static void main(String[] args)
    {
        System.out.println("Animal Kingdom App");

        Mammals m1 = new Mammals("Panda", 1869);
        Mammals m2 = new Mammals("Zebra", 1778);
        Mammals m3 = new Mammals("Koala", 1816);
        Mammals m4 = new Mammals("Sloth", 1804);
        Mammals m5 = new Mammals("Armadillo", 1758);
        Mammals m6 = new Mammals("Raccoon", 1758);
        Mammals m7 = new Mammals("Bigfoot", 2021);

        Birds b1 = new Birds("Pigeon", 1837);
        Birds b2 = new Birds("Peacock", 1821);
        Birds b3 = new Birds("Toucan", 1758);
        Birds b4 = new Birds("Parrot", 1824);
        Birds b5 = new Birds("Swan", 1758);

        Fish f1 = new Fish("Salmon", 1758);
        Fish f2 = new Fish("Catfish", 1817);
        Fish f3 = new Fish("Perch", 1758);

        List<AbstractAnimals> mylist = new ArrayList<>();
        mylist.add(m1);
        mylist.add(m2);
        mylist.add(m3);
        mylist.add(m4);
        mylist.add(m5);
        mylist.add(m6);
        mylist.add(m7);
        mylist.add(b1);
        mylist.add(b2);
        mylist.add(b3);
        mylist.add(b4);
        mylist.add(b5);
        mylist.add(f1);
        mylist.add(f2);
        mylist.add(f3);

        System.out.println();
        mylist.forEach(v -> System.out.println(v));

        mylist.sort((v1, v2) -> v2.getYearDiscovered() - v1.getYearDiscovered());
        System.out.println();
        mylist.forEach(v -> System.out.println(v));

        mylist.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println();
        mylist.forEach(v -> System.out.println(v));

        mylist.sort((v1, v2) -> v1.getMoves().compareToIgnoreCase(v2.getMoves()));
        System.out.println();
        mylist.forEach(v -> System.out.println(v));

        List<AbstractAnimals> lungslist = filterAnimals(mylist, a -> a.getBreathes() == ("lungs"));
        System.out.println();
        lungslist.forEach(v -> System.out.println(v));

        List<AbstractAnimals> lungswithyear = filterAnimals(mylist, a -> a.getBreathes() == ("lungs") && a.getYearDiscovered() == 1758);
        System.out.println();
        lungswithyear.forEach(v -> System.out.println(v));

        List<AbstractAnimals> lungswithEgss = filterAnimals(mylist, a -> a.getBreathes() == ("lungs") && a.getReproduce() == ("eggs"));
        System.out.println();
        lungswithEgss.forEach(v -> System.out.println(v));

        List<AbstractAnimals> yearlist = filterAnimals(mylist, a -> a.getYearDiscovered() == 1758);
        yearlist.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println();
        yearlist.forEach(v -> System.out.println(v));
    }
}