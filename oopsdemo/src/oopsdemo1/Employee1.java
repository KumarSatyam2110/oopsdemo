package oopsdemo1;

public class Employee1 {
int salary,hours;
	
	public void getInfo(int s,int h)
	{
		salary=s;
		hours=h;
	}
	
	public void show_salary()
	{
		System.out.println("Total Salary= $" + salary);
	}
	
	public void AddSal()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	
	public void AddWork()
	{
		if(hours>6)
		{
			salary=salary+5;
		}
	}

}
