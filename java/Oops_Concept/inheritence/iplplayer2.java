package inheritence;

public class iplplayer2  extends player{
    int jersey_no;
    int runs;
    boolean isAllRounder;
    boolean iscaptain;

    public iplplayer2(String name, int age, int experience,
                      int matchplayed, Gender gender, int jersey_no,
                      int runs, boolean isAllRounder, boolean iscaptain) {
        super(name, age, experience, matchplayed, gender);  //Super call the parents with immedieate
        this.jersey_no = jersey_no;
        this.runs = runs;
        this.isAllRounder = isAllRounder;
        this.iscaptain = iscaptain;
    }

    public iplplayer2(String name, int age, int experience, int matchplayed, Gender gender) {
        super(name, age, experience, matchplayed, gender);
    }

    void average(){
        System.out.println("Average +" + runs/matchplayed);
    }
}
