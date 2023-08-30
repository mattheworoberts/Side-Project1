package SideProject1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import SideProject1.MoneyCalculator;

public class MoneyCalculatorTest {
    @BeforeEach
    public void beforeEach() {
        assumeTrue(4 * 2 == 2 * 4);
        assumeTrue(1 * 0 == 0);
        assumeTrue(1 * 3 == 3);
        assumeTrue(3 - 3 == 0);
        assumeFalse(4 - 3 == 0);
        assumeFalse(false);
        assumeTrue(true);
    }

    @Test
    public void TotalMoneyCalculatorPennyTest() {
        assertEquals(MoneyCalculator.CalculatePenniesTotal(1), MoneyCalculator.CalculateCoinTotal(1, 0, 0, 0));
    }

    @Test
    public void TotalMoneyCalculatorNickelTest() {
        assertEquals(MoneyCalculator.CalculateNickelsTotal(1), MoneyCalculator.CalculateCoinTotal(0, 1, 0, 0));
    }

    @Test
    public void TotalMoneyCalculatorDimeTest() {
        assertEquals(MoneyCalculator.CalculateDimesTotal(1), MoneyCalculator.CalculateCoinTotal(0, 0, 1, 0));
    }

    @Test
    public void TotalMoneyCalculatorQuarterTest() {
        assertEquals(MoneyCalculator.CalculateQuartersTotal(1), MoneyCalculator.CalculateCoinTotal(0, 0, 0, 1));
    }

    @Test
    public void TotalMoneyCalculatorTest() {
        assertEquals(MoneyCalculator.CalculatePenniesTotal(1) +
                MoneyCalculator.CalculateNickelsTotal(1) +
                MoneyCalculator.CalculateDimesTotal(1) +
                MoneyCalculator.CalculateQuartersTotal(1), MoneyCalculator.CalculateCoinTotal(1, 1, 1, 1));
    }
}
