package com.tw.neew6;

import com.tw.neev6.Euro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EuroTest {
    @Test
    void shouldReturnEqualWhenValuesOfEurosAreEqual() {
        Euro euro1 = new Euro(10);
        Euro euro2 = new Euro(10);

        double euroValue1=euro1.getEuro();
        double euroValue2=euro2.getEuro();

        assertEquals(euroValue1,euroValue2);

    }
}
