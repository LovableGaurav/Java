package encapsulation;

public class car {

//   final private String name="MARUTI SUZIKI" ;
    final private String name;
    final private String noplate;
    private float mileage ;

    public car(String name, String noplate, float mileage) {
        this.name = name;
        this.noplate = noplate;
        this.mileage = mileage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
//        this.name = name;
    }

    public String getNoplate() {
        return noplate;
    }

    public void setNoplate(String noplate) {
//        this.noplate = noplate;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    String info(){
        return "car {" + "name=" + name + ", NumberPlate ="
                + noplate + " ,  Milege =" + mileage + '\'' + '}';
    }

}
