package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidBankAccountTest {

    @Test
    void valid_bank_account_result_should_be_True() {
        boolean expectedResult = true;
        String bankAccountNumber = "1234567890";
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidBankAccount(bankAccountNumber);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void invalid_bank_account_result_should_be_False() {
        boolean expectedResult = false;
        String bankAccountNumber = "1122334455";
        Agent agent = new Agent();

        boolean actualResult = agent.checkValidBankAccount(bankAccountNumber);

        assertEquals(expectedResult, actualResult);

    }
}