package inheritence;

public class TypeCasting {
    public static void main (String[] args){
        child c1 = new child();
        System.out.println(c1.x);
        System.out.println(c1.y);

        c1.fun2();
        c1.fun1();

        parent p1 = c1;    //  -> Upgrading a child to parent   -> UpCasting & its Implicit
        System.out.println(p1.x);
//        System.out.println(p1.y);   //-> Here it will Through error while printing Child Class and loose the access of child
        p1.fun1();
//        p1.fun2();    //  Here it will Through error while printing Child Class
    }

}
class parent{
    int x =8;
    void fun1(){
        System.out.println("Fun1 << ");
    }
}
class child extends parent{
    int y =10;
    void fun2(){
        System.out.println("Fun2 <<");
    }
}