public class Savings extends Account {

    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
        //System.out.println("Implement rate for savings ");

    }


    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
        //System.out.println(safetyDepositBoxID);
        // System.out.println(getSafetyDepositBoxKey);
//        System.out.println("Account number: " + this.accountNumber);
//        System.out.println("New Savings Account");
//        System.out.println("*********");
//        System.out.println("*********");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your savings account features: " +
                "\nSafety deposit box ID: " + safetyDepositBoxID +
                "\nSafety deposit box key " + getSafetyDepositBoxKey
        );
    }

}