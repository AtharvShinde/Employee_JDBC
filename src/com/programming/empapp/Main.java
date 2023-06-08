package com.programming.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String name;
        EmployeeDaoIntrf dao=new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Add Employee \n"+
                    "2. Show All Employee \n"+
                            "3. Show Employee based on ID \n"+
                            "4. Update the Employee \n"+
                            "5. Delete the Employee \n");
            System.out.println("Enter Your Choice");
            int c=sc.nextInt();
            switch (c){
                case 1:
                    Employee emp=new Employee();
                    System.out.print("Enter ID: ");
                     id=sc.nextInt();
                    System.out.print("Enter Name: ");
                     name=sc.next();
                    System.out.print("Enter Salary: ");
                    double salary=sc.nextDouble();
                    System.out.print("Enter Age: ");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter ID To Show The Details");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;
                case  4:
                    System.out.println("Enter ID To Update The Details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter The New Name");
                    name=sc.next();
                    dao.updateEmployee(empid1,name);
                    break;
                case 5:
                    System.out.println("Enter The ID To Delete");
                    id=sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 6:
                    System.out.println("Thank You For Using Our Application");
                    break;
                default:
                    System.out.println("Invalid Choice //Enter Valid Choice");
                    break;
            }
        }while (true);
    }
}
