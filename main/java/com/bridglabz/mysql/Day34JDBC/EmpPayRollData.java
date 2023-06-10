package com.bridglabz.mysql.Day34JDBC;

import java.time.LocalDate;

public class EmpPayRollData
{
	public int id;
    public String name;
    public double basic_pay;

    @Override
    public String toString() {
        return "EmpPayRollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basic_pay=" + basic_pay +
                ", start=" + start +
                '}';
    }

    public LocalDate start;

    /*
    Declaring Parametrised Constructor
     */
    public EmpPayRollData(int id,
                          String name,
                          double basic_pay,
                          LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.basic_pay = basic_pay;
        this.start = startDate;
    }
}
