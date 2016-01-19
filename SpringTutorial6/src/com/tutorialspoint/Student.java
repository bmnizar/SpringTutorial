package com.tutorialspoint;

public class Student {
   private Integer age;
   private String name;
   private Integer id;
   
   public Integer getId() {
	   System.out.println("Id : " + id );
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
	  System.out.println("Age : " + age );
      return age;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      System.out.println("Name : " + name );
      return name;
   }
   public void printThrowException(){
      System.out.println("Exception raised");
      throw new IllegalArgumentException();
   }
}