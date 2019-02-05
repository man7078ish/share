package com.cg.javaintro.main;

import java.util.Scanner;


import com.cg.javaintro.bean.Circle;
import com.cg.javaintro.bean.Employee;
import com.cg.javaintro.bean.IMyInterface;
import com.cg.javaintro.bean.Manager;
import com.cg.javaintro.bean.Shape;
import com.cg.javaintro.service.IJavaIntroService;
import com.cg.javaintro.service.JavaIntroServiceImpl;

public class Test {
	
	static Scanner sc = new Scanner(System.in);
	static IJavaIntroService service = null;
	
	
	public static void main(String[] args) {
		
				
				int choice=0;
		
		while(true)
		{
			System.out.println();
			System.out.println();
			System.out.println(" ****Welcome**** ");
			System.out.println("_______________________________\n");

			System.out.println("1.Enter Your Details");
			System.out.println("2.Exit");
			System.out.println("________________________________");
			System.out.println("Select an option: ");

			try {
				choice = sc.nextInt();

				switch (choice) {

				case 1:

					service=new JavaIntroServiceImpl();
					Employee emp = new Employee();
                   // System.out.println(emp);
                    
					System.out.println("Enter emplooyee id: ");
					String id=sc.next();
					if(service.validateEmpId(id))
					{
						int eid=Integer.parseInt(id);
						emp.setEmpId(eid);
						
					}
					else
					{
						System.out.println("Please enter valid emp id...");
					}
					
					System.out.println("Enter emplooyee name: ");
					String name=sc.next();
					if(service.validateEmpName(name))
					{
						emp.setEmpName(name);
						
					}
					else
					{
						System.out.println("Please enter valid emp name...");
					}
					System.out.println(emp);
					
					break;
					        
				case 2:

					System.out.print("Exit Application");
					System.exit(0);
					break;
					
				default:
					System.out.println("Enter a valid option[1-2]");

				}
				}catch(Exception exp)
				{
					exp.printStackTrace();
				}
				

			
}
		
	
	}}
