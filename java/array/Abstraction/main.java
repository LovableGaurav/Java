package Abstraction;

public class main {
    public static void main(String[] args){
        BankAccount B1 = new BankAccount("Gaurav" , 100000,258781912,"SBIN05637",AccountType.Saving);
//        BankDetail.info();
//    logger.info(BankDetail)
        System.out.println(B1.info());
        B1.deposit(4,54,868,976754);
        System.out.println(B1);
        B1.withdraw(56277);
        System.out.println(B1);
        B1.checkBalance();

    }
}
