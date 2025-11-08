public class BankApplication {


    private double balance;
    public static int accntOpend=0;

    BankApplication(double balance)
    {
        this.balance=balance;
        accntOpend++;

    }

    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount)
    {
        try {
            if(amount>0) {
                this.balance += amount;
            }
            else {
                throw new Exception("Amount Can't be negative");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error " +e.getMessage());
        }
        return balance;
    }

    public double withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new Exception("Withdraw amount must be positive");
            }
            if (amount > this.balance) {
                throw new Exception("Insufficient balance");
            }
            this.balance -= amount;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return this.balance;
    }

    public static void main(String [] args)
    {
       BankApplication acc1=new BankApplication(56342.7);
//        BankApplication acc2=new BankApplication(5475453.6);
       System.out.println("Initial Balance in Account is  "+acc1.getBalance());
       acc1.deposit(45343);
       System.out.println("Balance in Account After deposit  "+acc1.getBalance());
        System.out.println("Total User "+BankApplication.accntOpend);
        acc1.withdraw(34532);
        System.out.println("Balance in Account After withdraw  "+acc1.getBalance());
    }
}
