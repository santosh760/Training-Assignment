
class Employee{
	int id;
	String name;
	
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
	
	public Employee() {
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void doTask(){
		System.out.println("Employee Doing Task---"+this.id+" "+this.name);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Santosh");
		e1.doTask();
		
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("Santy");
		e2.doTask();
		

	}

}
