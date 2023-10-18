package by.stolybko;

import org.junit.jupiter.api.Test;

import static by.stolybko.Utils.isAllPositiveNumbers;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void isAllPositiveNumberIsCalledWithPositiveData() {
        assertTrue(isAllPositiveNumbers("1", "2"));
    }

    @Test
    void isAllPositiveNumberIsCalledWithNegativeData() {
        assertFalse(isAllPositiveNumbers("1", "-2"));
    }
}