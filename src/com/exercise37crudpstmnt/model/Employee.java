package com.exercise37crudpstmnt.model;
/**
 * 
 * @author jorge
 * @version 1.0
 *
 */
public class Employee
{
	private int idEmployee;
	private String nameEmployee;
	private int ageEmployee;
	private String addressEmployee;
	private double salaryEmployee;
	private String departmentEmployee;
	
	public Employee()
	{
		
	}
	
	/**
	 * 
	 * @param idEmployee
	 * @param nameEmployee
	 * @param ageEmployee
	 * @param addressEmployee
	 * @param salaryEmployee
	 * @param departmentEmployee
	 * 
	 * @return no values return 
	 */
	
	public Employee(int idEmployee, String nameEmployee, int ageEmployee,
			String addressEmployee, double salaryEmployee, String departmentEmployee)
	{
		this.idEmployee = idEmployee;
		this.nameEmployee  = nameEmployee;
		this.ageEmployee = ageEmployee;
		this.addressEmployee = addressEmployee;
		this.salaryEmployee = salaryEmployee;
		this.departmentEmployee = departmentEmployee;
	}
	
	public int getIdEmployee()
	{
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee)
	{
		this.idEmployee = idEmployee;
	}
	
	public String getNameEmployee()
	{
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee)
	{
		this.nameEmployee = nameEmployee;
	}
	
	public int getAgeEmployee()
	{
		return ageEmployee;
	}
	public void setAgeEmployee(int ageEmployee)
	{
		this.ageEmployee = ageEmployee;
	}
	
	public String getAddressEmployee()
	{
		return addressEmployee;
	}
	public void setAddressEmployee(String addressEmployee)
	{
		this.addressEmployee = addressEmployee;
	}
	
	public double getSalaryEmployee()
	{
		return salaryEmployee;
	}
	public void setSalaryEmployee(double salaryEmployee)
	{
		this.salaryEmployee = salaryEmployee;
	}
	
	public String getDepartmentEmployee()
	{
		return departmentEmployee;
	}
	public void setDepartmentEmployee(String departmentEmployee)
	{
		this.departmentEmployee = departmentEmployee;
	}
	
	public String toString()
	{
		return "idEmployee:"+this.idEmployee+"nameEmployee"+this.nameEmployee+"ageEmployee"+this.ageEmployee+"addressEmployee:"+this.addressEmployee+
				"salaryEmployee;"+this.salaryEmployee+"departmentEmployee;"+this.departmentEmployee;
	}
}
