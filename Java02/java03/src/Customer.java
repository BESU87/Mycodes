public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //getters
    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    //constructor

    public Customer(){
        this("nobody", "nobody@nowhere.com");
    }

    public Customer(String name, double creditLimit, String emailAddress){
        this.name =name;
        this.creditLimit =creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);

    }



}
