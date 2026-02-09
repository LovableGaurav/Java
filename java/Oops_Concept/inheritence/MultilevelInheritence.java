package inheritence;

public class MultilevelInheritence {
    public void main(String[] args){
        C c = new C();
        c.test();
//        System.out.println(c.x);
        A a = new A();
    }
    class A {
        int x= 10;
        private int y = 80;
    }
    class B extends A{
        int x =12;
    }
    class C extends B{
        int x = 14;
        void test(){
            System.out.println(x);
            System.out.println(super.x);
        }
    }
                  //class D extends B,A{ //Class can't inheritate multiple parent at the same time
                 //}


//                   class C extends B{
//                              Cyclic thinks  don't work in JAVA
//                  }
//                      class B extends  C{
//
//                         }

}
