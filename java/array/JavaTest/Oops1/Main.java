package JavaTest.Oops1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CredicardPayment c1 = new CredicardPayment(567);
        UpiPayment u1 = new UpiPayment(40);
        public void SetCardPayment ( long ... amount){
            System.out.println("Paid", Arrays.toString(amount));
        }
        public void SetUpiPay ( long amount){
            System.out.println("Paid", Arrays.toString({amount}));
        }
    }
}
