package com.bridgelabz.readfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePay
{
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePay(ArrayList<EmployeePayrollData> employeePayrollList)
    {
        this.employeePayrollList = employeePayrollList;
    }
    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePay employeePayrollService = new EmployeePay(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner consoleInputReader)
    {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
    private void writeEmployeePayrollData()
    {
        System.out.println("\n Writing Employee Payroll to Console\n"+employeePayrollList);
    }
}
