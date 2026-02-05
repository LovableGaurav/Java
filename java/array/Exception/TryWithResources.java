package Exception;

import java.util.Scanner;

public class TryWithResources {
    public static void main(){

        // Since Scanner is indirect child of AutoClosable so we can put in try with resources
        // and it will be auto close no need to close with sc.close()
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            for(int i =0;i<num;i++){
            Thread.sleep(500);
            System.out.println(i);
        }
        return;
//            System.exit(5);   // Forcefully exit a program
    }catch(InterruptedException e){
        throw new RuntimeException(e);
    }
        finally {
        System.out.println("finally Block executed");
//        sc.close();
    }
}}
