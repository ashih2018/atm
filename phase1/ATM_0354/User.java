package ATM_0354;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class User extends Person {

    private ArrayList<Account> accounts;
    private Date creationDate;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private int accountID;

    public User(String username, String password) {
        super(username, password);
        accountID = 0;
        creationDate = new Date();
    }

    public String getCreationDate() {
        return dateFormat.format(creationDate);
    }

    public int getAccountID() {
        return accountID;
    }

    public Account getAccount(int accountNum) {
        try {
            return accounts.get(accountNum);
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void addAccount(Account account) {

    }

    public String getSummary() {
        String summary = "";
        for (Account account: this.accounts) {
            summary += account.toString();
            summary += "\n";
        }
        return summary;
    }

    public String getLastTransaction(int accountNum) {
        Account account;
        try {
            account = this.accounts.get(accountNum);
        }
        catch (IndexOutOfBoundsException e) {
            return("This account does not exist");
        }

        return(account.getLastTransaction().toString());
    }

    public String getAccountDate(int accountNum) {
        Account account;
        try {
            account = this.accounts.get(accountNum);
        }
        catch (IndexOutOfBoundsException e) {
            return("This account does not exist");
        }
        return account.getDateOfCreation().toString();
    }

    public BigDecimal getAccountTotal() {
        BigDecimal total = new BigDecimal(0);
        for (Account account: this.accounts) {
            total.add(account.getBalance());
        }
        return total;
    }
}
