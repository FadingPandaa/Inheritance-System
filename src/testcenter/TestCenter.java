/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcenter;

/**
 *
 * @author ST10437711
 */
public class TestCenter {
    
    public static void main(String[] args) {
        
        Person person = new Person("John Doe", "123 Main St", "555-5555", "john.doe@example.com");
        Student student = new Student("Jane Doe", "123 Main St", "555-5556", "jane.doe@example.com", Student.FRESHMAN);
        DateHired DateHired = new DateHired(2020, 5, 20);
        Employee employee = new Employee("Bob Smith", "456 Elm St", "555-5557", "bob.smith@example.com", "Office 101", 50000, DateHired);
        Faculty faculty = new Faculty("Dr. Alice Johnson", "789 Oak St", "555-5558", "alice.johnson@example.com", "Office 102", 80000, DateHired, "MWF 10-12", "Professor");
        Staff staff = new Staff("Charlie Brown", "101 Pine St", "555-5559", "charlie.brown@example.com", "Office 103", 40000, DateHired, "Janitor");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}