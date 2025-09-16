abstract class BankAccount {
    protected String accNo, holder;
    protected double balance;

    public void deposit(double amt) { balance += amt; }
    public boolean withdraw(double amt) { 
        if (balance >= amt) { balance -= amt; return true; } 
        return false; 
    }

    public abstract double calcInterest();
}

class SavingsAccount extends BankAccount {
    private double rate;
    public SavingsAccount(String accNo, String holder, double balance, double rate) {
        this.accNo = accNo; this.holder = holder; this.balance = balance; this.rate = rate;
    }
    public double calcInterest() { return balance * rate / 100; }
}

class CurrentAccount extends BankAccount {
    private double overdraft;
    public CurrentAccount(String accNo, String holder, double balance, double overdraft) {
        this.accNo = accNo; this.holder = holder; this.balance = balance; this.overdraft = overdraft;
    }
    public double calcInterest() { return balance * 0.5 / 100; }
}

interface Loanable {
    void applyLoan();
    boolean isEligible();
}

class LoanableAccount extends BankAccount implements Loanable {
    private double creditScore;
    public LoanableAccount(String accNo, String holder, double balance, double score) {
        this.accNo = accNo; this.holder = holder; this.balance = balance; this.creditScore = score;
    }
    public double calcInterest() { return balance * 1 / 100; }
    public void applyLoan() { System.out.println(holder + " applied for loan."); }
    public boolean isEligible() { return creditScore > 600; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S101", "Alice", 10000, 5),
            new CurrentAccount("C202", "Bob", 20000, 5000),
            new LoanableAccount("L303", "Charlie", 15000, 750)
        };
        for (BankAccount acc : accounts)
            System.out.println(acc.holder + " Interest: " + acc.calcInterest());

        LoanableAccount loanAcc = new LoanableAccount("L404", "David", 12000, 580);
        loanAcc.applyLoan();
        System.out.println("Loan Eligible: " + loanAcc.isEligible());
    }
}
