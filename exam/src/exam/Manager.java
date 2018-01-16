package exam;

public class Manager extends Employee{
	public Manager(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void print(){
		 int total = salary+5000;
		System.out.println(name +" "+total);
	}
	public Manager(){
		
	}

}
