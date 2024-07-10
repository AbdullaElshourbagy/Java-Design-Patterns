package adapterDesignPattern.adaptee;

public class BankCustomerDetails {
    private String bankName;
    private String accountUserName;
    private long accountNumber;

    public BankCustomerDetails(String bankName, String accountUserName, long accountNumber) {
        this.bankName = bankName;
        this.accountUserName = accountUserName;
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankCustomerDetails{" +
                "bankName='" + bankName + '\'' +
                ", accountUserName='" + accountUserName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
