package com.capgemini.lab2.bean;

public class Lab2_3_person {

	
		private String firstName;
		private String lastName;
		private char Gender;
		
		//getter and setters
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public char getGender() {
			return Gender;
		}
		public void setGender(char gender) {
			Gender = gender;
		}
		
		//constructors
		public Lab2_3_person(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			Gender = gender;
		}
		public Lab2_3_person() {
			super();
		}

	

}

