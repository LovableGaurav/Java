package Abstraction;

import java.util.logging.Logger;

public class BankAccount {
//    static int counter;
    String name ;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;


    Logger logger = Logger.getLogger(BankAccount.class.getName());
    // this is the best Method  to return the Value without disclosing the Value and Details unless Printing with
    // Sysytem.out.println(getName())  --> This  is Wrong

    public BankAccount(String name, long balance, long accountNumber, String ifscCode, AccountType accountType) {
        this.name = name;

        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.balance = balance;
    }
    boolean deposit( long ... amount){

        for(long amt : amount){   // here we use for loop because long (...) -> this convert it into array amount is an array not int , VARARGS
            if(amt <=0){
                logger.warning("Invalid amount");
            }else{
                balance+=amt;
            }
            logger.info("new Balance is : "+ balance);
        } return true ;



    }

    void withdraw(long amount){
        if(amount <=0){
            logger.warning("invalid amount");
        } else if (amount > balance) {
            logger.warning("insifficinet Balnce");

        }else{
            balance-=amount;
            logger.info("Balance is SuccesFully Withdraw" + balance);
        }
    }

    void checkBalance(){
        logger.info("Balance : " + balance);
    }

//    @Override
    public String info() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}
