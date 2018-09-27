package model;

public class Employee {

	private String name;
	private double monthlySalary;
	private int age;
	
	public Employee() {
		name = null;
		monthlySalary = 0;					//FIX THIS
		age = 0;
	}
	
	public Employee(String n, double ms, int a) {
		setName(n);
		setMonthlySalary(ms);
		setAge(a);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", monthlySalary=" + monthlySalary + ", age=" + age + "]";
	}
	
	
	
	
}
