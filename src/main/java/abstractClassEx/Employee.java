package abstractClassEx;

public class Employee extends Person {
	private int empId;
	public Employee(String nm,String gen,int id) {
		super(nm, gen);
		this.empId=id;
	}
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p1=new Employee("Twisha", "F", 2);
		Person  p2=new Employee("xYZ", "F", 0);
		p1.work();p2.work();
		p1.changeName("Twisha Umesh Prabhu");
		System.out.println(p1.toString());

	}

}
