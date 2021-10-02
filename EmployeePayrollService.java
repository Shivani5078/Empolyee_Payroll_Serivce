package com.employee_pay_roll;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

	public enum IOService 
	{
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private ArrayList<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList) 
	{
		this.employeePayrollList = employeePayrollList;
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) 
	{
        System.out.println("Enter the Employee Id : ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter the Employee Name : ");
		String name = consoleInputReader.next();
		System.out.println("Enter the Employee Salary : ");
		double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	private void writeEmployeePayrollData()
	{
		System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
	}

	public static void main(String[] args)
	{
        System.out.println("--------- Welcome To Employee Payroll Application ----------");
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);

		employeePayrollService.readEmployeePayrollData(consoleInputReader);

		employeePayrollService.writeEmployeePayrollData();
    }
}

}
