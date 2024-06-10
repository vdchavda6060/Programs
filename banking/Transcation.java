
package banking;


public class Transcation implements Bank {
    public void deposite(Account acc,int amt){
        int newBal=acc.getBalance()+amt;
        acc.setBalance(newBal);
        System.out.println("Balence deposited");
    }
    public void withdraw(Account acc,int amt){
        int newBal=acc.getBalance()-amt;
        acc.setBalance(newBal);
        System.out.println("Balance withdraw");
    }
    public void totalAmt(Account acc){
        System.out.println("total Amount="+acc.getBalance());
    }

    
}
