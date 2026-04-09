/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcenter;

/**
 *
 * @author ST10437711
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private DateHired dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, DateHired dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}