package by.stolybko;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static by.stolybko.StringUtils.isPositiveNumber;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "11.1", "0.1"})
    void isPositiveNumberIsCalledWithPositiveData(String s) {
        //StringUtils stringUtils = new StringUtils();
        assertTrue(isPositiveNumber(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "-11.1", "-0.1"})
    void isPositiveNumberIsCalledWithNegativeData(String s) {
        assertFalse(isPositiveNumber(s));
    }

    @Test
    void isPositiveNumberIsCalledWithZeroData() {
        assertFalse(isPositiveNumber("0"));
    }

    @Test
    void isPositiveNumberIsCalledWithNullData() {
        assertThrows( IllegalArgumentException.class, () -> isPositiveNumber(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1a", "-+11.1", "-0.1-"})
    void isPositiveNumberIsCalledWithIncorrectData(String s) {
        assertThrows( IllegalArgumentException.class, () -> isPositiveNumber(s));
    }
}