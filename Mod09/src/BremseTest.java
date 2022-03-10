import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class BremseTest {

    private Bremse bremse;

    @Before
    public void setUp()
    {
        bremse = new Bremse(true,200,0,"20.09.21");
    }

    @Test
    public void testSettService()
    {
        bremse.upDateSistService();
        assertEquals(Calendar.getInstance().getTime().toString(), bremse.getSistService());
    }

}
