package Exception;

public class ExceptionPropagagtion {
    public static void main(){
        ExceptionPropagagtion ep = new ExceptionPropagagtion();
        try{
            ep.callA();
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("END");

    }
    private void callA(){
        System.out.println("CallA");
        callB();
    }
    private  void callB(){
        System.out.println("CallB");
        callC();
    }
    private void callC(){
        System.out.println("CallC");
        System.out.println(8/0);
    }
}
