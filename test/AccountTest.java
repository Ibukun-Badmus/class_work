public class AccountTest {
    public static void main(String[] args) {


        Account account1 = new Account("jane Green", 50.00);
        Account account2 = new Account("John Blue", 50.00);

        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }
}
