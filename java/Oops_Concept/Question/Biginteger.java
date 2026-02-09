package Question;
import java.math.BigInteger;
public class Biginteger {

    public static void main(String[] args) {
        long maxlong = Long.MAX_VALUE;

        long overflowed = maxlong * 10;
        System.out.println("Overflowed Long :" + overflowed);

        BigInteger bignum = BigInteger.valueOf(maxlong);  // Valueof is a Function so it will writen like "valueOf"
        BigInteger result = bignum.multiply(BigInteger.valueOf(10));
        System.out.println("BigInteger Result :" + result);
    }
}
