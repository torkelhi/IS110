import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

    private final Address address;
    private final String name;
    private ArrayList<Animal> myAnimals = new ArrayList<>();
    private HashMap<Address,String> ZooMap = new HashMap<>();

    public Zoo(Address address, String name){
        this.address = address;
        this.name = name;
        setUpAnimals();

        ZooMap.put(address, name);
    }

    /**
     * Setup for a Zoo. Must have a few animals from each class to start a Zoo.
     */
    private void setUpAnimals()
    {
        //Mammals
        Mammal cat = new Cat("Mille", "Black",40,12);
        Mammal dog = new Dog("Lassi", "Brown",100,30);
        Mammal ape = new Ape("Sven", "White",60,20);
        myAnimals.add(cat);
        myAnimals.add(dog);
        myAnimals.add(ape);

        //Birds
        Bird eagle = new Eagle("Flash","Brown and White",40,15);
        Bird eagle2 = new Eagle("AmericanPride","Brown, White and Yellow",60,20);
        Bird owl = new Owl("Bob","Grey",40,12);
        myAnimals.add(eagle);
        myAnimals.add(eagle2);
        myAnimals.add(owl);

        //Fish
        Fish shark = new Fish("BigTooth", "Blue and Red", 300,150);
        Fish sharkfood = new Fish("iAmFood","Yellow",20,10);
        Fish sharkfood2 = new Fish("iAmAlsoFood","Yellow",20,10);
        myAnimals.add(shark);
        myAnimals.add(sharkfood);
        myAnimals.add(sharkfood2);

        //Reptile
        Reptile reptile = new Reptile("Rango","LightBrown",5,2);
        Reptile reptile2 = new Reptile("Kevin","LightBrown",5,2);
        myAnimals.add(reptile);
        myAnimals.add(reptile2);

        //Amphibian
        Amphibian frog = new Amphibian("Prince","Green",5,3);
        Amphibian snake = new Amphibian("SSSSeverus Snape","Green",5,3);
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

    public void printAllAnimals()
    {
        for(Animal animal : myAnimals)
        {
            animal.printAnimal();
        }
    }

  public void printOnlyMammals()
    {
        for(Animal animal : myAnimals)
        {
            if(animal.isMammal)
            {
                animal.printAnimal();
            }
        }
    }
    public void printOnlyReptile()
    {
        for(Animal animal : myAnimals)
        {
            if(animal.isReptile)
            {
                animal.printAnimal();
            }
        }
    }
    public void printOnlyAmphibians()
    {
        for(Animal animal : myAnimals)
        {
            if(animal.isAmphibian)
            {
                animal.printAnimal();
            }
        }
    }

    public void printOnlyFish()
    {
        for(Animal animal : myAnimals)
        {
            if(animal.isFish)
            {
                animal.printAnimal();
            }
        }
    }



}
