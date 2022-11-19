import assignment1.refactor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class refactorTest {
    @Test
    void test1(){
        refactor.Calender calender =new refactor.Calender(19,11,2022);
        assertEquals("Next date: 20/11/2022",calender.getNextDate(calender.getDay(), calender.getMonth(), calender.getYear()));
    }
    @Test
    void test2(){
        refactor.Calender calender =new refactor.Calender(30,7,2022);
        assertEquals("Next date: 1/8/2022",calender.getNextDate(calender.getDay(), calender.getMonth(), calender.getYear()));
    }
    @Test
    void test3(){
        refactor.Calender calender =new refactor.Calender(31,12,2021);
        assertEquals("Next date: 1/1/2022",calender.getNextDate(calender.getDay(), calender.getMonth(), calender.getYear()));
    }
}
