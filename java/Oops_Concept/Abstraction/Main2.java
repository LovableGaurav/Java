package Abstraction;

public class Main2 {
    public static void main(String[] args) {
        LokSabhaImpl l1 = new LokSabhaImpl();
        l1.elect(8);
        l1.LocationofLoksabha();

        LokSabha l2 = new LokSabha() {
            @Override
            public void elect(int Candidate) {
                System.out.println("Election is Near");
            }
        };
        l2.elect(7);
        l2.LocationofLoksabha();
        LokSabha l3= new LokSabha() {
            @Override
            public void elect(int Candidate) {
                System.out.println("Election Is Live at :  " + Candidate);
            }
        };
        l3.elect(20);


    }
}
