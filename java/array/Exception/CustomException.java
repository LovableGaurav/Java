package Exception;

public class CustomException {
    private void callA() throws InterruptedException {
        System.out.println("CallA");
        callB();
    }

    public static void main(){
        CustomException ep = new CustomException();
        try {
            ep.callA();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // We should not include a catch with throwable as it catches Error as well
//        catch(Throwable e){
//            e.printStackTrace();
//        }
        System.out.println("END");

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
