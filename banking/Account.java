
package banking;

class Account {
    private String accname,email;
    private int Balance;

    @Override
    public String toString() {
        return "Account{" + "accname=" + accname + ", email=" + email + ", Balance=" + Balance + '}';
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
}
