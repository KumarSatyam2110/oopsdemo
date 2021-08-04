package oopsdemo1;

public class Employee {
	 private String name, address;
	  private int year, salary;
	  public Employee(String n, int y, int sal, String add){
	    name = n;
	    year = y;
	    salary = sal;
	    address = add;
	  }
	  public String getName(){
	    return name;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getSalary(){
	    return salary;
	  }
	  public String getAddress(){
	    return address;
	  }

}
