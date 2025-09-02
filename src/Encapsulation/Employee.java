package Encapsulation;

public class Employee {
    private Long salary;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(Long Salary){
        salary=Salary;
    }
    public Long getSalary(){
        return salary;
    }
}
