package com.bridglabz.mysql.Day34JDBC;

public class MainJDBC 
{
public static void main(String[] args) {
	System.out.println("Wellcome JDBC payroll Service");
	 EmpPayRollDBService service = new EmpPayRollDBService();
     System.out.println(service.readData());
}
}
