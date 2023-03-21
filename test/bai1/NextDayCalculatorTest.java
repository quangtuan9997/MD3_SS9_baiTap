package bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    void nextDay1of1() {
      int day=1;
      int mouth=1;
      int year=2018;
      String ex="2/1/2020";
      String re=NextDayCalculator.nextDay(day,mouth,year);
      assertEquals(ex,re);
    }
    @Test
    void nextDay31of1() {
        int day=31;
        int mouth=1;
        int year=2018;
        String ex="1/2/2018";
        String re=NextDayCalculator.nextDay(day,mouth,year);
        assertEquals(ex,re);
    }
    @Test
    void nextDay30of4() {
        int day=30;
        int mouth=4;
        int year=2018;
        String ex="1/5/2018";
        String re=NextDayCalculator.nextDay(day,mouth,year);
        assertEquals(ex,re);
    }
    @Test
    void nextDay28of2() {
        int day=28;
        int mouth=2;
        int year=2018;
        String ex="1/3/2018";
        String re=NextDayCalculator.nextDay(day,mouth,year);
        assertEquals(ex,re);
    }
    @Test
    void nextDay29of2() {
        int day=29;
        int mouth=2;
        int year=2020;
        String ex="1/3/2020";
        String re=NextDayCalculator.nextDay(day,mouth,year);
        assertEquals(ex,re);
    }
    @Test
    void nextDay31of12() {
        int day=31;
        int mouth=12;
        int year=2018;
        String ex="1/1/2019";
        String re=NextDayCalculator.nextDay(day,mouth,year);
        assertEquals(ex,re);
    }
}

