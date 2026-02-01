package inheritence;

public class player {
    static String name;
    int age;
    int experience;
    int matchplayed;
    Gender gender;

    public player(String name, int age, int experience, int matchplayed, Gender gender) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.matchplayed = matchplayed;
        this.gender = gender;
    }

    //    @Override
    public String info() {
        return "player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchplayed=" + matchplayed +
                ", gender=" + gender +
                '}';
    }
}
