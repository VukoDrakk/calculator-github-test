package pl.gov.coi.example;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Mock
    private Adder adder;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 4;
        Calculator calc = new Calculator();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(9, result);
    }

    @Test
    public void testSubstract() {
        // given
        int a = 5;
        int b = 4;
        Calculator calc = new Calculator();

        // when
        int result = calc.sub(a, b);

        // then
        assertEquals(1, result);
    }
}

