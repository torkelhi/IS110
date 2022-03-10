import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearTest {

    private Gear gear01;
    private Gear gear02;
    private Gear gear03;
    private Gear gear04;

    @Before
    public void setUp()
    {
        gear01 = new Gear(40);
        gear02 = new Gear(0);
        gear03 = new Gear(10);
        gear04 = new Gear(5);
    }

    @Test
    public void testConstructorRestrictions()
    {
        assertEquals(0,gear01.getMAX_CAPACITY());
    }

    @Test
    public void testChangeGearUpRestrction01()
    {
        gear02.changeGearUp();
        assertEquals(0,gear02.getGearNaa());
    }

    @Test
    public void testChangeGearUpRestriction02()
    {
        gear03.changeGearUp();
        assertEquals(0,gear01.getGearNaa());
    }

    @Test
    public void testChangeGearUpRestriction03()
    {
        gear04.changeGearUp();
        assertEquals(2,gear04.getGearNaa());
    }


}
