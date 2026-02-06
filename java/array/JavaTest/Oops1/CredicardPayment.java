package JavaTest.Oops1;

import static Abstraction.BankInterface.logger;

public class CredicardPayment extends Payment {
    public CredicardPayment(int amount, String cardPayment, String upiPay) {
        super(amount, cardPayment, upiPay);
    }

    @Override
    void SetCardPayment(long... amount) {
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("Invalid amounts");
            } else
                Balance1 -= amt;
        }
        logger.info("Payment is Successful " + amount);

    }
}
