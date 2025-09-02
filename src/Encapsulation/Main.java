package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee em= new Employee();
        em.setName("Avadhut");
        em.setSalary(1000000L);
        System.out.println(em.getName() +" "+ em.getSalary());

    }
}
