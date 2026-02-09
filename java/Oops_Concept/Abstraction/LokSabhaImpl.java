package Abstraction;

public class LokSabhaImpl implements  LokSabha{
    @Override
    public void elect(int Candidate) {
        System.out.println("Elelction is coming for Candidates :" + Candidate);
    }

    @Override
    public void LocationofLoksabha() {
        LokSabha.super.LocationofLoksabha();
    }
}
