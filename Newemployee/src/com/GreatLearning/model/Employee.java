package com.GreatLearning.model;

public class Employee {
       
	    //newEmpolyee Name   
		private String firstname;
		private String lastname; 
		
		 
	       //this is our parameterized constructor 
	       public Employee(String firstname,String lastname){
	         this.firstname= firstname;
	         this.lastname= lastname;
	         
	       }
	      
	    	  public void setfirstname(String firstname) {
	    		  this.firstname=firstname;  
	    	  }
	    	  
	    	 public void setlastname(String lastname) {
	    		 this.lastname=lastname; 
	      }
	    
	    		 public String getfirstname() {
	    			 return this.firstname;
	    		 }
	    		 public String getlastname() {
	    			 return this.lastname;
	    		 }
	    		 
}
	    		 
  
     
       