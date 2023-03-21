package bai3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslatTest {

    @Test
    void translat3() {
        int n=13;
        String ex="Fizz";
        String re=FizzBuzzTranslat.translat(n);
        assertEquals(ex,re);
    }
    @Test
    void translat5() {
        int n=53;
        String ex="Buzz";
        String re=FizzBuzzTranslat.translat(n);
        assertEquals(ex,re);
    }
    @Test
    void translat26() {
        int n=26;
        String ex="hai sáu ";
        String re=FizzBuzzTranslat.translat(n);
        assertEquals(ex,re);
    }
}