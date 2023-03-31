package kr.ac.kpo.day0331.homework;
// alt+shift+s 누른후 c선택 : 디폴트 생성자
//                  o선택 : 매개변수를 가진 생성자 
//					r선택 : getter/setter 메소드 생성
//					s선택 : toString() 오버라이드 -> 인스 생성시 해당 변수를 toString으로 불러오면 입력된 값들을 출력

// hash & equals를 id만 설정해서 객체의 아이디가 같은경우 같은 객체라고 하게 만듬

public class Member {
	
	private String id;
	private String password;
	public Member() {
		
		
		super();
	}
	
	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	

	public Member(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
//	public String toString() { //개발자 출력값 테스트용으로 자주 사용
//		return "Member [id=" + id + ", password=" + password + "]";
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

	
}
