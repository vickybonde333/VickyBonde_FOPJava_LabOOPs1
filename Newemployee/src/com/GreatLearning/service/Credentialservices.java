package com.GreatLearning.service;

import java.util.Arrays;
import java.util.Random;

public class Credentialservices {

	public char[] generatePassword() {
		
		String numbers="0123456789";
		String capitalletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String smallletters="abcdefghijklmnopqrstuvwxyz";
		String specialcharacters="!@#$%^&_.+/*-=<>";
				
		String values = capitalletters+smallletters+numbers+specialcharacters;

         Random random=new Random();
         
         char[] password = new char[8];
         
         for (int i=0 ; i<8 ; i++) {
        	 
			password[i]=values.charAt(random.nextInt(values.length()));
         }
         return password;
        	 
         }
         
	public String generateEmailAddress(String firstname,String lastname,String department) {
		return firstname+lastname+"@"+department+"greatlearning.com";
	}
	 public void showCredentials(String firstname,String email,char[] pwd) {
		 System.out.println("Dear"+firstname+" your generated credentials are as follows");
		 System.out.println("Email --->"+email);
		 System.out.println("Password --->"+ (Arrays.toString(pwd)));
	 }
	
}
