package com.samirahsessim.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @InjectMocks
    Calculator calculator;

    @Test
    public void sum_whenCalled_shouldReturnExpectedResult() {
        int result = calculator.sum(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void subtraction_whenCalled_shouldReturnExpectedResult() {
        int result = calculator.subtraction(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void multiplication_whenCalled_shouldReturnExpectedResult() {
        int result = calculator.multiplication(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void split_whenCalled_shouldReturnExpectedResult() {
        float result = calculator.split(10, 5);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test(expected = RuntimeException.class)
    public void sum_whenCalledWithNegativeValue_shouldThrowRunTimeException() {
        int result = calculator.sum(-10, 5);
    }

    @Test(expected = RuntimeException.class)
    public void split_whenCalledWithZeroValue_shouldThrowRunTimeException() {
        calculator.split(10, 0);
    }
}