package kr.ac.kpo.day0321.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		System.out.println("입사한 사원수 : " + Employee.employeeCnt + "명"); //static변수는 class이름으로 접근
		
		Employee.employeeCntInfo();
		
		
		
//		Employee e = new Employee(1, "홍길동", 3_400, "사원");
//		Employee e2 = new Employee(2, "고길동", 3_700, "주임");
//		Employee e3 = new Employee(3, "임길동", 3_500, "사원");
//		
//		e.info();
//		e2.info();
//		e3.info();
//
//		System.out.println("");
	}

}
