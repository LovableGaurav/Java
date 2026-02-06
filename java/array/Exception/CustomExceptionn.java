package Exception;

public class CustomExceptionn {

    public static void main(){
        CustomExceptionn ep = new CustomExceptionn();
        try {
            ep.callA();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END");

    }
    private void callA() throws InterruptedException {
        System.out.println("CallA");
        callB();
    }
    private  void callB() throws InterruptedException {
        System.out.println("CallB");
        callC();
    }
    private void callC() throws InterruptedException {
        System.out.println("CallC");
        Thread.sleep(500);
        System.out.println(8/0);
    }
}
