import transaction.Account;
import transaction.AccountService;
import transaction.State;
import transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AccountService accountService_1 = new AccountService();

        List<Account> accounts = new ArrayList<>();


        Transaction transaction_1 = new Transaction("uuid_1", State.CANCELLED, 10L);

        System.out.println(transaction_1);

        Account account_1 = new Account("uuid_1", 1000L);

        accounts.add(account_1);

        System.out.println("accounts.size(): " + accounts.size());

        System.out.println("account_1.getBalance(): " + account_1.getBalance());

        System.out.println(accountService_1.getSumAllCancelledTransactions(accounts));

/*        IntService intService = new IntService();

        System.out.println(intService.isPrime(1));
        System.out.println(intService.isPrime(7));

        IntStream intStream1 = IntStream.of(1, 30);
        IntStream intStream2 = IntStream.of(6, 49);

        System.out.println(intService.compose(intStream1, intStream2));*/


/*        List<String> mList = Arrays.asList("aa1","cc2", "cc1", "aa2", "bb1");

        mList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);*/

    }

}
