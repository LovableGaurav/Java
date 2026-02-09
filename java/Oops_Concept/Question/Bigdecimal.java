package Question;

import java.math.BigDecimal;

public class Bigdecimal {
    public static void main(String[] args) {
        double value = 1.00;
        for(int i =1;i<=10;i++){
            value -=0.10;
        }
        System.out.println(value);

    BigDecimal balanceBD = new BigDecimal("1.00");  // Pass the value in String
    BigDecimal step = BigDecimal.valueOf(0.10);
    for(int i =0;i<10;i++){
        balanceBD = balanceBD.subtract((step));  //
    }
        System.out.println("BigDecimal balance " + balanceBD);
    }
}
