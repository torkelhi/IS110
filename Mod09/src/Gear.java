
public class Gear {

    /**
     * Klasse av gear objekter. Den har max gir antall og nåværende gir.
     * Metodene er for å endre girens nåværende gir (gearNaa) og hente gearNaa.
     */

    private final int MAX_CAPACITY;
    private int gearNaa;

    public Gear(int MAX_CAPACITY) {
        if(MAX_CAPACITY < 0)
        {
            System.out.println("negative antal gear er ikke mulig");
        }
        if(MAX_CAPACITY >= 10)
        {
            System.out.println("Antall gear over 10 er ikke mulig");
        }
        this.MAX_CAPACITY = MAX_CAPACITY;

        if (MAX_CAPACITY == 0)
        {
            gearNaa = 0;
        }
        gearNaa = 1;
    }
    /**
     * 2 metoder for å sjekke om det er mulig å gire ned eller opp før en endring.
     * @return true hvis det er mulig og false om det ikke er det.
     */
    public boolean canBikeChangeGearUp()
    {
      if (gearNaa < MAX_CAPACITY || gearNaa == 1)
      {return true;}

      if (gearNaa == 0)
      {
          System.out.println("Denne sykkelen har ikke gear");
        return false;
      }
      return false;
    }

    public boolean canBikeChangeGearDown()
    {
        if (gearNaa == 1 || gearNaa == 0)
        {return false;}

        return true;
    }

    public void changeGearDown()
    {
        if(!canBikeChangeGearDown())
        {System.out.println("Kan ikke gire ned nå");}

        gearNaa -=1;
    }

    public void changeGearUp()
    {
        if(!canBikeChangeGearUp())
        {System.out.println("Kan ikke gire opp nå");}

        gearNaa +=1;
    }

    public int getGearNaa()
    {
        return gearNaa;
    }

    public int getMAX_CAPACITY()
    {
        return MAX_CAPACITY;
    }


}
