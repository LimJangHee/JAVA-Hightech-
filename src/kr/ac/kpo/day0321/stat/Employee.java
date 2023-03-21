package kr.ac.kpo.day0321.stat;

public class Employee {
	
	int no;
	String name;
	int salary;
	String grade;
	static int employeeCnt; //클래스당 단 하나의 값만 공유하고 싶은 경우 static을 사용
							//인스(변수)보다 먼저 생성됨
							//해당 케이스에서 static을 사용하지 않을 경우 인스별로 생성되기 때문에 계속 1만 나옴 
	
	
	Employee(){
		employeeCnt++;
	}
	
	Employee(int no, String name, int salary, String grade) {
		 this.no = no;
		 this.name = name;
		 this.salary = salary;
		 this.grade = grade;
		 employeeCnt++;
	}
	
	void info() {
		System.out.println("사번 : " + no + ", 이릅 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {//static을 통해 객체를 생성하지 않고도 메소드를 사용할 수 있음 -> 호출할때는 클래스명을 사용
		System.out.println("입사한 사원수 : " + Employee.employeeCnt + "명");	
		}
}
