package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerTimesTest {

    @Test
    void deposit_less_than_30000_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 500.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTimes(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_to_30000_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTimes(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_greater_than_30000_result_should_be_False() {
        boolean expectedResult = false;
        float depositCash = 35000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTimes(depositCash);

        assertEquals(expectedResult, actualResult);
    }

}