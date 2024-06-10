
package banking;

public class TestTrancation {
    public static void main(String args[]){
        Account acc=new Account();
        acc.setAccname("chavda kishan");
        acc.setEmail("chavdakishan@gmail.com");
        acc.setBalance(50000);
        Transcation tcs=new Transcation();
        tcs.deposite(acc, 3000);
        System.out.println(acc);
        tcs.withdraw(acc, 1000);
        tcs.totalAmt(acc);
    }
}
