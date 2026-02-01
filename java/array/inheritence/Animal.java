package inheritence;

public class Animal extends Object

//    Run Time Polymorphism -> Method overriding
//    Compile Time Polymorphism -> Method Overloading
{

    String name;
    public static void main(String[] args){
        tiger tiger = new tiger();
        tiger.run();
        tiger.name="royal Bengal tiger";
        tiger.age = 45;
        System.out.println(tiger);
    }
    void run(){
        System.out.println("Animal is running");
    }
}
class tiger extends Animal{
int age ;
    @Override //Annotation
    void run(){
        System.out.println("Tiger is running");
    }

    @Override
    public String toString() {
        return "tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
