import Utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();
        String file = "/Users/alex/Desktop/HDD/NewBankAccounts.csv";
        List<String[]> newAccountHolders = CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {

            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + sSN + " " + accountType + " " + "R " + initDeposit);
            if (accountType.equals("Savings")) {
                //System.out.println("Open a savings account");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                // System.out.println("Open a cheque account");
                accounts.add(new Cheque(name, sSN, initDeposit));
            } else {
                System.out.println("Error reading account type");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n************");
            acc.showInfo();
        }


    }
}


