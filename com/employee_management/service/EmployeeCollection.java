package com.employee_management.service;

import com.employee_management.res.Employee;

public class EmployeeCollection {
    Employee []employees;
    int collectionSize = 0;
    public EmployeeCollection(int size){
        employees = new Employee[size];
    }

    public void addEmployee(String id,String name,int age,double salary){
        if(collectionSize >= employees.length)return;
        Employee emp = new Employee(id,name,age,salary);
        employees[collectionSize++] = emp; 
    }

    public void displayList(){
        System.out.println("-----Report------");
        for(int i=0;i<collectionSize;i++){
            System.out.println(employees[i].getId()+" "+employees[i].getName()+" "+employees[i].getAge()+" "+employees[i].getSalary());
        }
        System.out.println("--------End of Report----------");
    }
}
