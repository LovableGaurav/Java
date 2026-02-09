package Abstraction;


@FunctionalInterface
public interface LokSabha {
    void elect(int Candidate);
//    void election();

    static void members(){
        System.out.println("There are " + 543 + "Members in Loksabha");

    }
    default void LocationofLoksabha(){
        System.out.println("Location is delhi");
    }

}
