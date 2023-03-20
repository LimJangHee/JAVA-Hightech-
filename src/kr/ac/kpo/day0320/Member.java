package kr.ac.kpo.day0320;

public class Member {
	
	String name; /** 이름*/
	int age;	/** 나이*/
	String bloodType; /** 혈액형*/
	
	//생성자는 대문자로 시작하며(클래스명과 동일하기 때문에) 반환값이 없음
	//생성자 호출은 new를 통해서만 가능 -> 그런데 생성자 내에서 오버로딩된 다른 생성자를 불러오기 위해서는 new를 사용할 수 없어서 this를 사용
	//this는 항상 생성자의 제일 처음에 있어야됨
	
	Member(){ //매개변수를 가지는 생성자를 만들때 디폴트 생성자도 같이 만들어 주는게 좋음

		this("알수없음", -1, "알수없음"); //생성자 안에서 생성자를 가져와서 초기화 하고 싶을때는 this를 사용하면 됨
		
//		this.name = "알수없음";
//		this.age = -1;
//		this.bloodType = "알수없음";
	} 
		
	Member(String name, int age, String bloodType){ //생성자를 통해 값을 가져옴(클래스명을 그대로 쓰면 됨) -> 디폴트 생성자도 같이 만들어 주는게 좋음
		this.name = name; //멤버변수랑 지역변수의 이름이 동일할때 this를 써주면 멤버변수를 표기할 수 있음(지역변수가 우선순위라 this를 안쓰면 둘다 지역변수가 됨)
		this.age = age;
		this.bloodType = bloodType;
	}
	
	Member(String name){ //전달 받는 값의 개수가 달라져서 따로 생성(오버로딩으로)

		this(name, -1, "알수없음"); //3개자리 생성자를 호출
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알수없음";
	}
	
	Member(String name, int age){

		this(name, age, "알수없음");
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
		
	}
	
	//-------------------------------------가장 단순화하면------------------------------------------

/*	
	Member(){
		this("알수없음");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
*/	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}

}
