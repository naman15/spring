package aop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee 
{	
	@Id
	@GeneratedValue //creates sequence in db and use this to generate this primary key
	private int id;
	
	private String name;
	
	private Employee() 
	{
		
	}
	
	public Employee(String name,int salary) 
	{
		this.name=name;
		this.salary=salary;
				
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int salary;
}
