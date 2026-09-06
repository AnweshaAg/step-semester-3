public class MessWallet{
    private double balance;
    MessWallet(double currentBalance){
        if(currentBalance<0){
            System.out.println("Balance cannot be negative. Setting balance to 0.");
            balance=0;
        }
        else{
            balance=currentBalance;
        }
    }
    public void topup(double amount){
        if(amount<0){
            System.out.println("Topup amount cannot be negative.");
        }
        else{
            balance+=amount;
            System.out.println("Topup successful. New balance: "+balance);
        }
    }
    public void deduct(double amount){
        if(amount<0){
            System.out.println("Deduction amount cannot be negative.");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance. Deduction failed.");
        }
        else{
            balance-=amount;
            System.out.println("Deduction successful. New balance: "+balance);
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(100.0);
        wallet.topup(50.0);
        wallet.deduct(25.0);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}