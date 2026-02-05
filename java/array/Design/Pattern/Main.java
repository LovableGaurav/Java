package Design.Pattern;

public class Main {
    public static void main(){
        PrimeMinister pm1 = PrimeMinister.declarePm("Mr Modi", 60);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());

        PrimeMinister pm2= PrimeMinister.declarePm("Mr Rahul", 45);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());
//        PrimeMinister pm1 = new PrimeMinister("Mr Modi ", 60);
//        System.out.println(pm1);
//        System.out.println(pm1.hashCode());
//
//        PrimeMinister pm2 = new PrimeMinister("Mr Rahul ", 45);
//        System.out.println(pm2);
//        System.out.println(pm2.hashCode());
    }
}
