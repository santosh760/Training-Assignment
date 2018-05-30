class Emp{
	int id;
	String name;
	
	void doTask(){
		System.out.println("Employee Doing Task---"+id+" "+name);
		System.out.println("using This keyword---- "+this);
	}
}


public class TestThis {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.doTask();
		System.out.println("Employee object--"+e1);
		
		Emp e2=new Emp();
		e2.doTask();
		System.out.println("Employee object--"+e2);

	}

}
