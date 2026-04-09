/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcenter;

/**
 *
 * @author ST10437711
 */
public class DateHired {
    private int year;
    private int month;
    private int day;

    public DateHired(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}