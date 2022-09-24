package com.maven;

import java.util.Scanner;
import com.maven.daoimpl.EmployeeDaoImpl;


public class App 
{
    
	public static void main( String[] args )
    {
    	
    	//create BookDaoImpl class object
    			EmployeeDaoImpl e = new EmployeeDaoImpl();
    	        char c;
    	        
    	        do {
    	        	@SuppressWarnings("resource")
    	        	//create scanner class object
    				Scanner sc = new Scanner(System.in);
    	        	
    	        	//user input
    	        	System.out.println("Press:1  Add Employee details");
    	        	System.out.println("Press:2  Display Employee details");
    	        	System.out.println("Press:3  Update Employee price");
    	        	System.out.println("Press:4  Delete Employee details");
    	        	System.out.println("Press:5  Exit");
    	        	
    	        	int ch=sc.nextInt();
    	        	System.out.println("-----------------------------");
    	        	
    	        	//using switch to get method
    	        	switch(ch) {
    	        	case 1:
    	        		e.addEmployee();//calling this method for add employee details
    	        		break;
    	        	case 2:
    	        		e.fetchEmployee();//calling this method for display employee details
    	        		break;
    	        	case 3:
    	        		e.updateEmployee();//calling this method for update employee details
    	        		break;
    	        	case 4:
    	        		e.deleteEmployee();//calling this method for delete employee details
    	        		break;
    	        	case 5:
    	        		System.exit(0);
    	        		break;
    	        	default:System.out.println("Invalid choice!");//for invalid choice
    	        	}
    	        	//to continue or not
    	        	System.out.println("Do you want to continue? Y/N");
    	        	c = sc.next().charAt(0);
    	        	//case sensitive validation
    	        }while(c =='y' || c =='Y');
    	        System.out.println("------Thank you visit again-------");
    	         
    	        
    	    }  	
    	
    }
    

