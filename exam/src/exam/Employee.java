package exam;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	public void print(){
		System.out.println(name +" " +salary);
	}
	public Employee(){
		
	}
}
