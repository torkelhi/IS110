import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private ArrayList<Animal> myAnimals = new ArrayList<>();
    private HashMap<Address,String> ZooMap = new HashMap<>();

    public Zoo(Address address, String name){
        setUpAnimals();
        ZooMap.put(address, name);
    }

    /**
     * Setup for a Zoo. Must have a few animals from each class to start a Zoo.
     */
    private void setUpAnimals()
    {
        //Mammals
        Animal cat = new Cat("Mille", "Black",40,12);
        Animal dog = new Dog("Lassi", "Brown",100,30);
        Animal ape = new Ape("Sven", "White",60,20);
        myAnimals.add(cat);
        myAnimals.add(dog);
        myAnimals.add(ape);

        //Bird
        Animal eagle = new Eagle("Flash","Brown and White",40,15);
        Animal eagle2 = new Eagle("AmericanPride","Brown, White and Yellow",60,20);
        Animal owl = new Owl("Bob","Grey",40,12);
        myAnimals.add(eagle);
        myAnimals.add(eagle2);
        myAnimals.add(owl);

        //Fish
        Animal shark = new Fish("BigTooth", "Blue and Red", 300,150);
        Animal sharkfood = new Fish("iAmFood","Yellow",20,10);
        Animal sharkfood2 = new Fish("iAmAlsoFood","Yellow",20,10);
        myAnimals.add(shark);
        myAnimals.add(sharkfood);
        myAnimals.add(sharkfood2);

        //Reptile
        Animal reptile = new Reptile("Rango","LightBrown",5,2);
        Animal reptile2 = new Reptile("Kevin","LightBrown",5,2);
        myAnimals.add(reptile);
        myAnimals.add(reptile2);

        //Amphibian
        Animal frog = new Amphibian("Prince","Green",5,3);
        Animal snake = new Amphibian("SSSSeverus Snape","Green",5,3);
        myAnimals.add(frog);
        myAnimals.add(snake);
    }

    public void whatCanIseeToday(ScheduleDay day)
    {
        switch (day)
        {
            case MONDAY, TUESDAY -> printOnlyReptile();
            case WEDNESDAY -> printOnlyFish();
            case THURSDAY ->printOnlyAmphibians();
            case FRIDAY -> printOnlyMammals();
            case SATURDAY,SUNDAY -> printAllAnimals();

        }
    }

    private void printAllAnimals()
    {
        for(Animal animal : myAnimals)
        {
            animal.printAnimal();
        }
    }

    /**
     * Methods using the instance of method.
     * For every instance of the class specified it print.
     *
     * Is private, because it is for the method above - whatCanIseeToday.
     * This can be achieveable with less methods. Only for practice.
     */
    private void printOnlyMammals()
    {
        for(Animal animal : myAnimals)
        {
            if(animal instanceof Mammal)
            {
                animal.printAnimal();
            }
        }
    }

    private void printOnlyReptile()
    {
        for(Animal animal : myAnimals)
        {
            if(animal instanceof Reptile)
            {
                animal.printAnimal();
            }
        }
    }

    private void printOnlyAmphibians()
    {
        for(Animal animal : myAnimals)
        {
            if(animal instanceof Amphibian)
            {
                animal.printAnimal();
            }
        }
    }

    private void printOnlyFish()
    {
        for(Animal animal : myAnimals)
        {
            if(animal instanceof Fish)
            {
                animal.printAnimal();
            }
        }
    }


    // Using the interface type to only get animals that can speak and act.
    public void printOnlyAnimalThatCanSpeak()
    {
        for(Animal animal : myAnimals)
        {
            if(animal instanceof AnimalSound)
            {
                animal.printAnimal();
            }
        }
    }

    /**
     * Method to search for a specific animal.
     * It goes through the arraylist and check's if the animalsearch string equals the class.
     * @param animalSearch
     */
    public void searchForAnimal(String animalSearch)
    {
        for(Animal animal : myAnimals)
        {
            if(animal.getClass().toString().toLowerCase().contains(animalSearch.toLowerCase()))
            {
                animal.printAnimal();
            }
        }
    }
}
