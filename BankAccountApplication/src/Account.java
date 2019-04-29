
public abstract class Account implements BaseRate {

    private String name;
    private String sSN;
    private double balance;
    private static int index = 10_000;
    protected String accountNumber;
    protected double rate;

    public Account(String name, String sSN, double initDeposit) {
        index++;
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        //System.out.println("Name: " + name + "\nSSN: " + sSN + "\nBalance: " + balance);
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();


    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest: R " + accruedInterest);
        printBalance();

    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing: R " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing: R " + amount);
        printBalance();
    }


    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring: R " + amount + " to " + toWhere);
        printBalance();


    }

    public void printBalance() {
        System.out.println("Your balance is now: R " + balance);
    }


    public void showInfo() {
        System.out.println(
                "Name: " + name +
                        "\nAccount number: " + accountNumber +
                        "\nBalance: " + balance +
                        "\nRate: " + rate + "%"
        );
    }

}
