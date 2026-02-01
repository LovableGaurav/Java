package encapsulation;

public class Employee {
    private  String name ;
    private int empId;
    private String  CompmnayName;
    private boolean isPermanentEmployee;
    private long salary;
    private long phonenumber;
    public String getCompmnayName(){
        return CompmnayName;
    }
// what is private constructuctor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setCompmnayName(String compmnayName) {
        CompmnayName = compmnayName;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
