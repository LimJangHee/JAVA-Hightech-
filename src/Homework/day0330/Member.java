package Homework.day0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
	
	private String id;
	private String pw;
	
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
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if(this.id.equals(((Member)obj).id)) { //Object타입으로 받아왔기 때문에 같은 타입형으로 비교를 위해 Employee타입으로 변경
//			return true;
//		}
//		return false;
//	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
