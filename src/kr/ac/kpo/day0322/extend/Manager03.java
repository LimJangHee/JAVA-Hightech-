package kr.ac.kpo.day0322.extend;

public class Manager03 extends Employee {

	Employee[] 	empList;	// 관리사원 목록
	
	public Manager03() {
		
	}
	
	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("--------------------------------------------------");
		System.out.println("\t\t< 관리사원 리스트 >");
		System.out.println("--------------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("--------------------------------------------------");
	}
	
}