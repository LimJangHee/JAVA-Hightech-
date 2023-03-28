package kr.ac.kpo.day0328.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set : 순서 X, 중복 X
	구현클래스
		-HashSet
		-TreeSet
	메소드
		- add()
		- contains()
		- remove()
		- clear()
		- size()
		-isEmpty()
 */

public class SetMain {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); //참조자료형만 가능, 1.7버전이후부터는 new에 타입 안넣어도 됨
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("two"); //add가 boolean값을 반환해주는데 겹치는 값이 있을경우 false를 반환해주며 입력이 안됨
		System.out.println("set : " + set); //입력했던 순서와 상관없음, TreeSet의 경우 사전 순서로 출력해줌 
		
		//"two"가 존재하면 삭제하고 삭제성공 출력, 존재하지 않으면 존재하지 않음 츨력
		if(set.contains("two")) {
			set.remove("two");
			System.out.println("데이터 삭제성공");
		} else {
			System.out.println("데이터 존재하지 않음");
		}
		
		System.out.println(set.remove("two")? "삭제성공" : "존재하지 않음");
		
		/*
		 * Set 전체데이터 접근방식
		 * 1. 1.5버전의 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator객체 이용
		 */
		
		System.out.println("< 1.5버전의 for문 이용  >");
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println("< toArray() 메소드 이용 >");
		Object[] dataArr = set.toArray(); //set이가지고 있는 데이터를 고정된 배열로 반환
		for(int i = 0; i < dataArr.length; i++) {
			System.out.println(dataArr[i] + " length() : " + ((String)dataArr[i]).length());
			//배열이 object형이라 .length메소드를 사용할 수 없음, 그래서 형변환을 해줘야됨
		}
		
		/*
		 * Iterator 주요 메소드
		 * hasNext() : 다음데이터 존재여부 판단
		 * next()    : 데이터 이동
		 */
		System.out.println(" < Iterator 객체 이용 >");
		Iterator<String> ite = set.iterator();//iterator메소드가 iterator객체를 반환
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
