package lesson_15.homework;

import lesson_15.homework.exceptions.WrongAccountException;
import lesson_15.homework.exceptions.WrongCurrencyException;
import lesson_15.homework.exceptions.WrongOperationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankApplication {

    private final List<Account> accounts = new ArrayList<>() {{
        add(new Account("accountId001", 100, "USD"));
        add(new Account("accountId002", 500, "EUR"));
        add(new Account("accountId003", 250, "HRV"));
        add(new Account("accountId004", 1000, "USD"));
        add(new Account("accountId005", 750, "USD"));
        add(new Account("accountId006", 50, "USD"));
    }};

    public void process(String accountId, int amount, String currency) throws Exception {
        Account account = accounts.stream()
                .filter(acc -> acc.getId().equals(accountId))
                .findFirst().orElseThrow(WrongAccountException::new);

        if (!account.getCurrency().equals(currency)) {
            throw new WrongCurrencyException();
        }

        if (account.getBalance() < amount) {
            throw new WrongOperationException();
        }

        int randomInt = new Random().nextInt(2);
        if (randomInt == 1) {
            throw new Exception();
        }

        account.setBalance(account.getBalance() - amount);
    }
}
