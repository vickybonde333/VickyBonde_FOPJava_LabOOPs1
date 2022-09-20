package com.GreatLearning.app;

import java.util.Scanner;

import com.GreatLearning.model.Employee;
import com.GreatLearning.service.Credentialservices;

public class Credentialsmethod {

	public static void main(String[] args) {
	
		Employee employee=new Employee("Vicky","Bonde");
		Credentialservices credentialservices =new Credentialservices();
		String generatedemail="";
		char[] generatedpwd;
			
		System.out.println("Please enter the department from the following.");
		System.out.println("(1) Technical");
		System.out.println("(2) Admin");
		System.out.println("(3) Human Resource");
		System.out.println("(4) Legal");
		
		Scanner scanner = new Scanner(System.in);
		int option=scanner.nextInt();
		
		if(option==1) {
			generatedemail=credentialservices.generateEmailAddress(employee.getfirstname(),employee.getlastname(),"TECH");
			
		}else if(option==2) {
			 generatedemail=credentialservices.generateEmailAddress(employee.getfirstname(),employee.getlastname(),"ADM");
			 
		}else if(option==3) {
			 generatedemail=credentialservices.generateEmailAddress(employee.getfirstname(),employee.getlastname(),"HR");
			 
		
		}else if(option==4) {
			 generatedemail=credentialservices.generateEmailAddress(employee.getfirstname(),employee.getlastname(),"LG");
			 
		
		}else {
			System.out.println("Enter a valid option");
			scanner.close();
		    System.exit(-1);
		}
		
		
		generatedpwd=credentialservices.generatePassword();
		credentialservices.showCredentials(employee.getfirstname(),generatedemail,generatedpwd);
		scanner.close();

}
}
