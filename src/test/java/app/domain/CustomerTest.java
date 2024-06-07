package app.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer sut = CustomerFactory.build(3000D);
    Customer sut_age = CustomerFactory.build(30);
    Customer sut_location = CustomerFactory.build("SP");

    @Test
    void thisIncomeIsEqualsOrLowerThan() {
        assertTrue(sut.thisIncomeIsEqualsOrLowerThan(3000D));
        assertTrue(sut.thisIncomeIsEqualsOrLowerThan(4000D));
    }

    @Test
    void thisIncomeIsEqualsOrBiggerThan() {
        assertTrue(sut.thisIncomeIsEqualsOrBiggerThan(3000D));
        assertTrue(sut.thisIncomeIsEqualsOrBiggerThan(2000D));
    }

    @Test
    void thisIncomeBetweenThan() {
        assertTrue(sut.thisIncomeBetweenThan(2000D, 4000D));
        assertTrue(sut.thisIncomeBetweenThan(3000D, 5000D));
        assertFalse(sut.thisIncomeBetweenThan(4000D, 6000D));
    }

    @Test
    void thisAgeLowerThan() {
        assertTrue(sut_age.thisAgeLowerThan(35));
        assertFalse(sut_age.thisAgeLowerThan(25));
    }

    @Test
    void thisLocationIsEqualsThan() {
        assertTrue(sut_location.thisLocationIsEqualsThan("SP"));
        assertFalse(sut_location.thisLocationIsEqualsThan("BA"));
    }
}