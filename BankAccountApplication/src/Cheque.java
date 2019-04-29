
public class Cheque extends Account {

    private int debitCardNumber;
    private int debitCardPIN;



    public Cheque(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
//        System.out.println("Account number: " + this.accountNumber);
//        System.out.println("New Cheque Account");
//        System.out.println("*********");
//        System.out.println("*********");
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
        //System.out.println("Implement rate for cheque");
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
//        System.out.println("Card: " + this.debitCardNumber);
//        System.out.println("Pin: " + this.debitCardPIN);


    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your cheque account features " +
                "\nDebit card number " + debitCardNumber +
                "\nDebit card pin: " + debitCardPIN
        );
    }
}
