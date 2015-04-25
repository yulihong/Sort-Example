package com.lyu.sortpersontask.beans;

import java.util.Objects;

public class Person {
   
   private String firstName = "";
   private String lastName = "";
   private AgeGroup age;
   
   public Person(){}
   
   public Person(String firstName, String lastName, AgeGroup age) {
      setFirstName(firstName);
      setLastName(lastName);
      setAge(age);
   }

   /**
    * @return the firstName
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * @return the lastName
    */
   public String getLastName() {
      return lastName;
   }


   /**
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * @return the age
    */
   public AgeGroup getAge() {
      return age;
   }

   /**
    * @param age the age to set
    */
   public void setAge(AgeGroup age) {
      this.age = age;
   }

   /*@Override
   public boolean equals(Object obj)
   {
	   if(obj == null)
		   return false;
	   if(this == obj)
		   return true;
	   if(getClass() != obj.getClass())
		  return false;
	   
	   Person person = (Person)obj;
	   return Objects.equals(firstName, person.getFirstName()) &&
			   Objects.equals(lastName, person.getLastName()) && 
			   Objects.equals(age, person.getAge());
   }
   
   @Override
   public int hashCode()
   {
	   int result = 1;
	   result = result*31 + (firstName == null ? 0 : firstName.hashCode());
	   result = result*31 + (lastName == null ? 0 : lastName.hashCode());
	   result = result*31 + (age == null ? 0 : age.hashCode());
	   return result;
   }*/
   
   // A better way
   @Override
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		
		Person person = (Person)obj;
		return Objects.equals(firstName, person.firstName) &&
				Objects.equals(lastName, person.lastName) &&
				Objects.equals(age, person.age);	
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(firstName, lastName, age);
	}
   
   
   @Override
   public String toString() {
      return firstName + " " + lastName + " " + age;
   }
   
   public enum AgeGroup {
	   Minor(), Adult(), Senior(), Aaa();
	}
}
