package MultiTHreading;

public class VisibilityProblem {

    // Volatile keyword ensures that all thread see the same value of the variable
     volatile static boolean flag = true;

    public static void main(String[] args) {
        Thread t1=new Thread(() ->{
            while(flag){
                System.out.println("Stop me if you Can");
            }});
        t1.start();
        Thread t2=new Thread(() ->{
            flag = false;
            System.out.println("! Stopped");
            });
        t2.start();

        }
    }

