package com.tenzin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoGetFour(){
        var obj = new SimpleCalculator();
        assertEquals(4,obj.add(2,2));
    }

}