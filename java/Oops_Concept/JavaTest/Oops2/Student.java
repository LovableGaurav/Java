package JavaTest.Oops2;

class Student {
    String name;
    double marksObtained;

    static String collegeName = "LPU";
    static final double MAX_MARKS = 500;

    public Student(String name, double marksObtained) {
        this.name = name;
        this.marksObtained = marksObtained;
    }

//    @Override
    public String info() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marksObtained=" + marksObtained +
                '}';
    }

    public void printPercentage() {
        double percentage = (marksObtained / MAX_MARKS) * 100;
        System.out.println(name + "'s Percentage: " + percentage + "%");
    }


        }





