package JavaTest.Oops1;

import static Abstraction.BankInterface.logger;

public class UpiPayment extends Payment {
    public UpiPayment(int amount,  String upiPay) {
        super(amount,  upiPay);
    }

//    @Override


//    @Override
    void SetUpiPay(long amount) {
            if (amount <= 0) {
                logger.warning("Invalid amounts");
            } else
                Balance2 -= amount;

        logger.info("Payment is Successful " + amount);

    }
    }


