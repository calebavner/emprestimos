package app.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static app.domain.Constants.CUSTOMER;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Nested
    class thisIncomeIsEqualsOrLowerThan {

        @Test
        void deveRetornarTrueQuandoIncomeIgual() {
            assertTrue(CUSTOMER.thisIncomeIsEqualsOrLowerThan(5000D));
        }

        @Test
        void deveRetornarTrueQuandoIncomeMenor() {
            assertTrue(CUSTOMER.thisIncomeIsEqualsOrLowerThan(5000D));
        }


    }

    @Nested
    class thisLocationIsEqualsThan {

        @Test
        void deveRetornarTrueQuandoLozalizacaoIgual() {
            assertTrue(CUSTOMER.thisLocationIsEqualsThan("SP"));
        }

        @Test
        void deveRetornarFalseQuandoLocalizacaoDiferente() {
            assertFalse(CUSTOMER.thisLocationIsEqualsThan("BA"));
        }
    }

    @Nested
    class thisAgeLowerThan {

        @Test
        void deveRetornarVerdadeiroQuandoIdadeMenor() {
            assertTrue(CUSTOMER.thisAgeLowerThan(30));
        }

        @Test
        void deveRetornarFalsoQuandoIdadeMaior() {
            assertFalse(CUSTOMER.thisAgeLowerThan(20));
        }
    }

    @Nested
    class thisIncomeBetweenThan {

        @Test
        void deveRetornarVerdadeiroQuandoSalarioEntreMaximoEMinimo() {
            assertTrue(CUSTOMER.thisIncomeBetweenThan(2000D, 5000D));
        }

        @Test
        void deveRetornarFalsoQuandoSalarioMenorQueMinimo() {
            assertFalse(CUSTOMER.thisIncomeBetweenThan(4000D, 5000D));
        }

        @Test
        void deveRetornarFalsoQuandoSalarioMaiorQueMaximo() {
            assertFalse(CUSTOMER.thisIncomeBetweenThan(1000D, 2000D));
        }
    }
}