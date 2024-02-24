package zely.parkinglot.model.account;

public abstract class Account {

    //data members

    private String username;
    private String password;

    private Person person; //refer to an instance of the Person class

    private AccountStatus status; //refers to the accountstatus enum

    public abstract boolean resetPassword();




}
