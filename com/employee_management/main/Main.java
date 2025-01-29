package com.employee_management.main;

import java.io.*; 
import com.employee_management.service.*;


interface Constants{
    final static int SIZE = 10;
}

public class Main implements Constants {
     static void displayMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Add an Employee");
        System.out.println("2. Display All");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");
     }

     static void manager() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        EmployeeCollection ec = new EmployeeCollection(SIZE);
        boolean flag = true;
        while(flag){
            displayMenu();
            int n = Integer.parseInt(br.readLine());
            switch(n){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = br.readLine();
                    System.out.print("Enter the Employee Name :");
                    String name = br.readLine();
                    System.out.print("Enter Employee Age: ");
                    int age = Integer.parseInt(br.readLine());
                    System.out.print("Enter Employee Salary: ");
                    double salary = Double.parseDouble(br.readLine());
                    ec.addEmployee(id,name,age,salary);
                    break;
                case 2:
                    ec.displayList();
                case 3:
                    System.out.println("Exiting the system");
                    flag = false;
                    break;
            }
            
        }
     }

     public static void main(String []args){
        try{
            manager();
        }catch(IOException err){
            System.out.println(err);
        }
     }

}
