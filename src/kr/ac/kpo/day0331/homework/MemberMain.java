package kr.ac.kpo.day0331.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		
		List<Member> members = new ArrayList<>();
		members.add(new Member("aaa", "1111"));
		members.add(new Member("bbb", "1111"));
		members.add(new Member("ccc", "1111"));
		members.add(new Member("ddd", "1111"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("** 비밀번호 변경서비스 ***");
		System.out.println("아이디를 입력 : ");
		String id = sc.nextLine();
		
		//hash & equals에서 객체와 객체가 서로 같다는것을 지정해주는데 여기서는 id만 지정해주어서 contains를 통해서 비교할 수도 있음
		//contains출력값은 true/false라서 위치를 알아야 할때는 다르게 써야됨
		//indexOf도 필요 -> 객체간에 같다라는 의미를 사용하기 위해서는 hash&equals를 다 사용해줘야됨
		int idx =  members.indexOf(new Member(id)); //in
		if(idx == -1) {
			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		Member mem = members.get(idx);
				
//		Member mem = null; //주소값을 저장하기 위한 변수
//		for(int i = 0; i < members.size();i++) {
//			if(members.get(i).getId().equals(id)) {
//				mem = members.get(i);
//				break;
//			}
//		}
//		if(mem == null) {
//			System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
//			System.out.println("서비스를 종료합니다");
//			System.exit(0);
//		}
		
		System.out.print("패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!mem.getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드를 입력하세요 : ");
		password = sc.nextLine();
		mem.setPassword(password);
		System.out.println("패스워드 변경을 완료하였습니다");
		
		System.out.println("-----------------------------");
		System.out.println("\t전체회원 정보 출력");
		System.out.println("-----------------------------");
		System.out.println("아이디\t패스워드");
		System.out.println("-----------------------------");
		for(Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPassword());
		}
		System.out.println("-----------------------------");
	}

}
