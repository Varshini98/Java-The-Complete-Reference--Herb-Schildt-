
import java.util.Scanner;
import java.lang.Math;



class Bank {

    float interest;
    float interest_rate; // divide by 100
    int compound_frequency;
    int years;
    double deposit;
    double maturity_amount; // intreset earned or the total amount in the end

    public void calcuateMaturityamount(double deposit, float interest, int compound_frequency, int years) {
        this.deposit = deposit;
        this.interest = interest;
        this.compound_frequency = compound_frequency;
        this.years = years;

        interest_rate = interest / 100;
        double p;
        p = deposit;
        maturity_amount = p * Math.pow((1 + interest_rate / compound_frequency), years * compound_frequency);
       System.out.println( "\n "+"Maturity Amount: " + Math.round(maturity_amount) + "\n ");
    }

    // Searching only Fixed Deposit Account
    public void getFixedDepositAccount(String custID) {
        boolean find = false;
        Iterator<FixedDepositAccount> itr = fixeddeposit_accounts.iterator();
        while (itr.hasNext()) {
            FixedDepositAccount c = itr.next();
            String a = c.getCustID();
            if (custID.equals(a)) {
                c.displayFixedDepositAccount();
                calcuateMaturityamount(c.getdeposit(), c.getinterest(), c.getcompoundfrequency(), c.getyears());
                find = true;
            }
        }
        if (!find) {
            System.out.println(" No Fixed Deposit Account !");
        }
    }
    
}


public class enumfd {
    public static void main(String[] args) {
        
    }
    
}
