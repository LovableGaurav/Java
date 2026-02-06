package JavaTest.Oops2;

class Student {
    String name;
    double marksObtained;

    static String collegeName = "LPU";
    static final double MAX_MARKS = 100;

    public Student(String name, double marksObtained) {
        this.name = name;
        this.marksObtained = marksObtained;
    }

    public void printPercentage() {
        double percentage = (marksObtained / MAX_MARKS) * 100;
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.printf("Percentage: %.2f%%\n\n", percentage);
    }


        }





