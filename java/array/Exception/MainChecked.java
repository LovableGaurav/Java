package Exception;

public class MainChecked {
    public static void main(){
        for (int i =0;i<10;i++ ){
            try {
                Thread.sleep(500);   // sleep uses as pause and start in ms
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }}
}
