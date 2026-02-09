package Abstraction;

import java.util.logging.Logger;

public interface BankInterface {
    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());
    int x = 9;

    abstract void deposit(long... amount);

    void withdraw(long amount);
}
