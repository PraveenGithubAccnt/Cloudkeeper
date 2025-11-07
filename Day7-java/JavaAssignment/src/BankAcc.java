public class BankAcc {
    String accountNumber ,holderName;
     double balance;

     BankAcc(String accountNumber, String holderName, double balance)
     {
         this.accountNumber=accountNumber;
         this.holderName=holderName;
         this.balance=balance;
     }

     public void BankDetails()
     {
           System.out.print("The user Account number is "+accountNumber+ " Name is "+holderName+" and balance is " +balance);
     }

     public static void main(String[] args)
     {
         BankAcc user=new BankAcc("435653253432","Akash",5463432.87);
        user.BankDetails();
     }
}
