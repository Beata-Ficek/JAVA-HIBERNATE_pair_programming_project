import models.Editor;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class EditorTest {

    Editor editor1;
    LocalDate date1;

    @Before
    public void before(){
        date1 =  LocalDate.of(2011, 11, 11);
        editor1 = new Editor("Jim", date1, 7);
    }


    @Test
    public void hasName() {
        assertEquals("Jim", editor1.getName());

    }

    @Test
    public void hasStartDate(){
        assertEquals(date1, editor1.getStartDate());
    }

    @Test
    public void hasYearsOfService(){
        assertEquals(7, editor1.getYearsOfService());
    }

    @Test
    public void canSetDate(){
        editor1.setStartDate( LocalDate.of(2010, 10, 13));
        assertEquals(new Date(2010, 10, 13), editor1.getStartDate());
    }
}
