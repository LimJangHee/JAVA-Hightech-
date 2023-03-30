package Homework.day0330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceUtil {

	List<Member> members = new ArrayList<Member>();
	Scanner sc = new Scanner(System.in);

	public void addMember() {

		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine();
		System.out.print("패스워드를 입력 : ");
		String password = sc.nextLine();

		members.add(new Member(id, password));

		for (int i = 0; i < members.size() - 1; i++) {
			if (members.size() == 1) {
				break;
			} else if ((members.get(i)).getId().equals(id)) {
				System.out.println("중복된 아이디입니다.");
				members.remove(members.size() - 1);
			}
		}

	}

	public void changePW() {
		
		System.out.println("비밀번호를 변경할 아이디를 입력해주세요 : ");
		String inputid = sc.nextLine();
		int index;
		for(index = 0; index < members.size(); index++) {
			if(members.get(index).getId().equals(inputid)) {
				System.out.println("변경할 비밀번호를 입력해주세요.");
				String newpassword = sc.nextLine();
				members.get(index).setPw(newpassword);
				break;
			} else {
				System.out.println("존재하지 않는 아이디 입니다.");
				break;
			}
		}
		
	}

	public void getMemberList() {
		System.out.println("===============================================");
		System.out.println("ID\tPASSWORD");
		System.out.println("===============================================");
		for (Member m : members) {
			System.out.println(m.getId() + "\t" + m.getPw());
		}
		System.out.println("===============================================");
	}

	public void process() {

		int choose = 0;

		while (true) {
			System.out.println("원하는 서비스를 선택하여 주세요 : 1. 아이디, 비밀번호 생성 2. 비밀번호 변경 3. 회원리스트 0 서비스 종료");
			choose = sc.nextInt();
			sc.nextLine();

			if (choose == 1) {
				addMember();

			}
			if (choose == 2) {
				changePW();

			}
			if (choose == 3) {
				getMemberList();
			}

			if (choose == 0) {
				System.out.println("서비스를 종료합니다.");
				break;
			}
		}

	}

}
