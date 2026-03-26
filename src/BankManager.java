import java.util.ArrayList;

class BankManager {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}