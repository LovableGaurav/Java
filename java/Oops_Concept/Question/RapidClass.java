package Question;

public class RapidClass {
    public static void main() {
        Integer a= 100;
        Integer b =100;
        System.out.println( a== b);
        Integer x =200;
        Integer y = 200;
        System.out.println("Comparing the address");
        System.out.println(x==y);
        System.out.println("Comapring the Variable ");//for the object and Integer there is a cache it limit the range from -127 to 128
        System.out.println(x.equals(y));

        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println("Double compare the address");
        System.out.println(d1 == d2);
        System.out.println("compare the value");//In Case of Double it always compare the address rather than the values
        System.out.println(d1.equals(d2));  //Java jus create two static objects : boolean True  and Boolena false
                                           // Every time you box a boolean , you are just pointing to one of those two  .
    }
}
