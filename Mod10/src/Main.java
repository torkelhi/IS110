/**
 * This program you represent a Customer using a service to filter out what you want to see.
 * You can filter regarding the animals species.
 * You can filter regarding the Zoo's schedule.
 *
 * Later implementations will be to filter regarding the Address.
 */
public class Main {

    public static void main(String[] args)
    {
        Zoo bergen = new Zoo(Address.BERGEN,"Akvariet");

        bergen.whatCanIseeToday(ScheduleDay.SATURDAY);

        //bergen.searchForAnimal("fish");
        //bergen.searchForAnimal("cat");
        //bergen.searchForAnimal("eagle");





    }
}
