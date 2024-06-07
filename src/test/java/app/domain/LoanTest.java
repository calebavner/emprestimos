package app.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LoanTest {

    @Mock
    private Customer customer;

    @InjectMocks
    private Loan loan;

    @Test
    void isPersonalLoanAvailable() {
        when(customer.thisIncomeIsEqualsOrLowerThan(3000D)).thenReturn(true);
        assertTrue(loan.isPersonalLoanAvailable());
    }

    @Test
    void isPersonalLoanAvailableCase2() {
        when(customer.thisIncomeIsEqualsOrLowerThan(3000D)).thenReturn(false);
        when(customer.thisIncomeBetweenThan(3000D, 5000D)).thenReturn(true);
        when(customer.thisAgeLowerThan(30)).thenReturn(true);
        when(customer.thisLocationIsEqualsThan("SP")).thenReturn(true);

        assertTrue(loan.isPersonalLoanAvailable());
    }

    @Test
    void isGuaranteedLoanAvailable() {
        when(customer.thisIncomeIsEqualsOrBiggerThan(5000D)).thenReturn(true);
        assertTrue(loan.isGuaranteedLoanAvailable());
    }

    @Test
    void isConsignmentLoanAvailable() {
        when(customer.thisIncomeIsEqualsOrLowerThan(3000D)).thenReturn(false);
        when(customer.thisIncomeBetweenThan(3000D, 5000D)).thenReturn(true);
        when(customer.thisAgeLowerThan(30)).thenReturn(true);
        when(customer.thisLocationIsEqualsThan("SP")).thenReturn(true);

        assertTrue(loan.isPersonalLoanAvailable());
    }

    @Test
    void getPersonalInterestRate() {
        assertEquals(4D, loan.getPersonalInterestRate());
    }

    @Test
    void getGuaranteedInterestRate() {
        assertEquals(3D, loan.getGuaranteedInterestRate());
    }

    @Test
    void getConsignmentInterestRate() {
        assertEquals(2D, loan.getConsignmentInterestRate());
    }
}