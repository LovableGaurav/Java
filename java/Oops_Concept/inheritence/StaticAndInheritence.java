package inheritence;

public class StaticAndInheritence {
    public static void main(String[] args){
        sample2 sample2 = new sample2();
        System.out.println(sample2.x);
        sample2.callme();
    }

}
    class sample1{
        int x =9;

        static void callme(){
            System.out.println("calling from Static one");
        }
    }
    class sample2 extends sample1{
   // @Override           Method hiding
        static void callme(){
            System.out.println("calling from Static two");
        }
    }

