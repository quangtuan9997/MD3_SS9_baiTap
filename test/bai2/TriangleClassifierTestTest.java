package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTestTest {

    @Test
    void refactor222() {
        int a=2, b=2, c=2;
        String ex="tam giác đều";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
    @Test
    void refactor223() {
        int a=2, b=2, c=3;
        String ex="tam giác cân";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
    @Test
    void refactor345() {
        int a=3, b=4, c=5;
        String ex="không phải là tam giác";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
    @Test
    void refactor823() {
        int a=8, b=2, c=3;
        String ex="không phải là tam giác";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
    @Test
    void refacto121() {
        int a=-1, b=2, c=1;
        String ex="không phải là tam giác";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
    @Test
    void refactor011() {
        int a=0, b=1, c=1;
        String ex="không phải là tam giác";
        String re=TriangleClassifierTest.refactor(a,b,c);
        assertEquals(ex,re);
    }
}