package inheritence;

public class Football2 extends player {
    int goal;
    int jerseyNumber;
    boolean isCaptain;

    public Football2(String name, int age, int experience, int matchplayed, int goal, Gender gender, int jerseyNumber, boolean isCaptain) {
        super(name, age, experience, matchplayed, gender);
        this.goal = goal;
        this.jerseyNumber = jerseyNumber;
        this.isCaptain = isCaptain;
    }
}
