package Abstraction;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        BankInterface bankInterface = new Bankinterfaceiml("Gaurav", 1000, 537633, "SBIN8389", AccountType.Saving);

        BankInterface ac4 = new BankInterface() {
            @Override
            public void deposit(long... amount) {
                System.out.println("deposit :" + Arrays.toString(amount));
            }

            @Override
            public void withdraw(long amount) {
                System.out.println("withdraw :" + amount);
            }
        };
        ac4.deposit(76,89);
        ac4.withdraw(78);


//        BankAccount B1 = new BankAccount("Gaurav" , 100000,258781912,"SBIN05637",AccountType.Saving);
////        BankDetail.info();
////    logger.info(BankDetail)
//        System.out.println(B1.info());
//        B1.deposit(4,54,868,976754);
//        System.out.println(B1);
//        B1.withdraw(56277);
//        System.out.println(B1);
//        B1.checkBalance();

    }
}
