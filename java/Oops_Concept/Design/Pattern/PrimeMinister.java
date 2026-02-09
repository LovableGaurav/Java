package Design.Pattern;

public class PrimeMinister {
    String Name ;
    int age;

//    2. Declare
    private static PrimeMinister pm;

//    1. Make Constructor Private
    private PrimeMinister(String name, int age) {
        Name = name;
        this.age = age;
    }
//    PrimeMinister pm1 = new PrimeMinister("Mr Modi ", 45);
//     3. make a static fn that will create an object for pm
    static  PrimeMinister declarePm(String name, int age){
        if(pm == null){
            pm = new PrimeMinister(name,age);
        }
        return pm;
        //        new PrimeMinister("Mr Modi ", 45)
    }
    @Override
    public String toString() {
        return "PrimeMinister{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
