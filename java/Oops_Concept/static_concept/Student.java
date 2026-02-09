package static_concept;

public class Student {
    int id;
    String name ;
    static  String collegeName;

    static {
        System.out.println("static 1 is executed");
        collegeName = "IIT";
    }

    public Student(int id, String name) {
        System.out.println("constructor is executed");
        this.id = id;
        this.name = name;
    }

//    @Override
    public String info() {
        return "Student{" +
                " , id=" + id +
                " , college Name " + collegeName+
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(){
        Student student = new Student(3,"Gaurav");
        System.out.println(student.info());
    }
}
