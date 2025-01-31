public class Account {

    private String  accountNumber;
    private double balance;
    private String name;
    private String email;
    private String  phoneNumber;


    //setter starts here


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String  accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //These are the methods for a money withdrawl and deposite

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("The deposited amount $ " + depositAmount + " your current balnce will be $" + balance);
    }


    public void withDrawl(double withDrawlAmount) {
        if (balance - withDrawlAmount < 0) {
            System.out.println("Insufficent amount in the balance ");
        } else {
            balance -= withDrawlAmount;
            System.out.println("The withdrawl amount is " + withDrawlAmount + "your current balance will be " + balance);
        }

    }


}

