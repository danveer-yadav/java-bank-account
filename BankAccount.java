package OOPS;

public class BankAccount {

    private  String accountholder;
    private double balance;

    public BankAccount(String accountholder , double balance){
        this.accountholder = accountholder;
        this.balance = balance;
    }
       

     // METHOD 

    public void deposit( double amount){
       
        if(  amount > 0){
            balance = balance + amount;
            System.out.println(" Deposit " + amount );

        }
        else{
            System.out.println(" INVALID DEPOSIT " + amount);
        }
    }
    public void withdrawal(double amount){
        
        if( amount < 0 || amount <= balance){
            balance = balance - amount;
            System.out.println(" Withdrawal " + amount);
        }else {
            System.out.println(" INVALID WITHDRAWAL " + amount );
        }
    }
     
    public double getBalance(){
        return balance;
    }

        
    public static void main(String[] args) {
        BankAccount A = new BankAccount("Danveer", 1000);
        A.deposit(1000);
        A.withdrawal(300);
        System.out.println(" Balance : " + A.getBalance());
        
    }
    
}

        

   


    
    
    
    
    













