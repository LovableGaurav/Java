package JavaTest.Oops1;

abstract public class Payment {
     long amount ;
     String CardPayment;
     String UpiPay;
     int Balance1 = 10000;
     int Balance2 = 5000;


     public Payment(int amount, String cardPayment, String upiPay) {
         this.amount = amount;
         CardPayment = cardPayment;
         UpiPay = upiPay;
     }
    abstract void SetCardPayment(long ... amount);
    protected abstract void SetUpiPay(long amount);
//     @Override
     public String info() {
         return "Payment{" +
                 "amount=" + amount +
                 ", CardPayment='" + CardPayment + '\'' +
                 ", UpiPay='" + UpiPay + '\'' +
                 '}';
     }



