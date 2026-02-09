package inheritence;

public class IPLplayer {

    String name ;
    int age;
    int jersey_no;
    int runs;
    int experience;
    int matchPlayed;
    boolean isAllRounder;
    boolean iscaptain;

    public IPLplayer(String name, int age, int jersey_no, int runs, int experience, int matchPlayed, boolean isAllRounder, boolean iscaptain) {
        this.name = name;
        this.age = age;
        this.jersey_no = jersey_no;
        this.runs = runs;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.isAllRounder = isAllRounder;
        this.iscaptain = iscaptain;
    }
     void average (){
         System.out.println("Average "+ (runs /matchPlayed));
     }

    public String info() {
        return "IPLplayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jersey_no=" + jersey_no +
                ", runs=" + runs +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", isAllRounder=" + isAllRounder +
                ", iscaptain=" + iscaptain +
                '}';
    }
}
