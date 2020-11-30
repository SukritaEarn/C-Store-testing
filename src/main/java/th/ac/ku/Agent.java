package th.ac.ku;

import java.util.*;

public class Agent {

    private final int depositLimitPerTimes = 30000;
    private final int depositLimitPerDay = 50000;
    private final ArrayList<String> validBankAccountNumber = new ArrayList<String>(Arrays.asList("1234567890", "112236677"));
    private final static Map<String, Float> minimumDepositForEachAccountType;
    static {
        minimumDepositForEachAccountType = new HashMap<String, Float>();
        minimumDepositForEachAccountType.put("A", 100.00f);
        minimumDepositForEachAccountType.put("B", 200.00f);
    }

    public Boolean checkDepositPerTimes(float depositCash) {
        return depositCash <= depositLimitPerTimes;
    }

    public Boolean checkDepositPerDay(float depositCash) {
        return depositCash <= depositLimitPerDay;
    }

    public Boolean checkValidBankAccount(String bankAccountNumber) {
        return validBankAccountNumber.contains(bankAccountNumber);
    }

    public Boolean checkMinimumDepositCashByAccountType(String accountType, float depositCash) {
        boolean accountTypeChecked = minimumDepositForEachAccountType.containsKey(accountType);
        boolean depositValueChecked = false;

        if (accountTypeChecked) {
            Float minimumDepositValue = minimumDepositForEachAccountType.get(accountType);
            depositValueChecked = depositCash >= minimumDepositValue;
        }

        return accountTypeChecked && depositValueChecked;
    }

}