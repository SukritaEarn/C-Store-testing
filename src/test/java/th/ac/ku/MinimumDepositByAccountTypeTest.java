package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositByAccountTypeTest {

    @Test
    void deposit_less_than_100_with_result_should_be_False() {
        boolean expectedResult = false;
        float depositCash = 50.00f;
        String accountType = "A";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumDepositCashByAccountType(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_equal_to_100_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 100.00f;
        String accountType = "A";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumDepositCashByAccountType(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_greater_than_100_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        String accountType = "A";
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumDepositCashByAccountType(accountType, depositCash);

        assertEquals(expectedResult, actualResult);
    }
}