package Exception;

import java.util.Scanner;

public class TryCatchCombo {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            for (int i = 0; i < num; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
//            return;
//            System.exit(5);   // Forcefully exit a program
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally Block executed");
            sc.close();
        }
        Scanner sc2 = null;
        try {
//            Scanner sc2;
            sc2 = new Scanner(System.in);
            System.out.println(8 / sc2.nextInt());
        } finally {
            sc.close();
        }

    }
}
