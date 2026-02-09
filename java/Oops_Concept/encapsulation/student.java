package encapsulation;

public class student {
    private int roll ;
    private String name ;

    public student (int roll, String name ){
        this.roll = roll;
        this.name = name ;

    }
    String info(){
        return "student {" + "roll=" + roll + ", name ="
+ name + '\'' + '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }
}
