package jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import aop.model.Employee;

@Repository
@Transactional
public class EmployeeRepo
{
	@PersistenceContext
	EntityManager em;
	
	public Employee getById(int id) 
	{
		return em.find(Employee.class,id);	
	}
	
	@Transactional
	public Employee insert(String name,int salary) 
	{
		Employee emp=new Employee(name, salary);
		return em.merge(emp);
	}
	
	public void  deleteById(int id) 
	{
		Employee emp=getById(id);
		 em.remove(emp);
	}
}
