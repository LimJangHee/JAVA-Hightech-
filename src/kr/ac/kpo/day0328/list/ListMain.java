package kr.ac.kpo.day0328.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	List
	특징 : 중복 허용, 순서 보유
	구현클래스
		-ArrayList
		-LinkedLIst
		
	메소드	
	- add()      : 데이터 삽입
	- get()      : 특정위치의 데이터 조회
	- remove()   : 특정위치 또는 특정값을 가진 데이터 삭제
	- clear()    : 전체 데이터 삭제
	- size()     : 리스트의 전체 원소개수 
	- isEmpty()  : 리스트가 비어있는지 여부 판단
	- contains() : 특정 데이터가 존재하는 판단
	- addAll()   : 다른 리스트이 원소들을 전체 추가
 */

public class ListMain {
	
	public static void main(String[] args) {
		
		// List<String> list = new ArrayList<String>(); //generic안에 들어올 수 있는 데이터 타입은 참조자료형만 가능(int이런거 안됨)
		List<String> list = new LinkedList<String>(); //결과는 ArrayList랑 똑같이 나옴
		
		System.out.println("list : " + list);
		System.out.println("전체원소의 개수 : " + list.size());
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println("add() 후 전체워소의 개수 : " + list.size());
		System.out.println("list : " + list);
		
		System.out.println("0번지 데이터 : " + list.get(0));
		System.out.println("0번지 삭제데이터 : " + list.remove(0)); //삭제되는 데이터값을 반환해주고 삭제
		System.out.println("list " + list);
		System.out.println("remove(0) 후 0번지 데이터 : " + list.get(0)); //삭제 후 1번지에 있던 데이터가 0번지로 땡겨짐
		list.add(2, "TEN"); //2번지에 데이터를 집어넣주면 나머지 자료들은 뒤로 밀림
		System.out.println("list : " + list);
		
		System.out.println("< 인덱스를 통한 전체 데이터 출력 >");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(" < 1.5버전의 for문 전체 데이터 출력 >");
		for(String str : list) {
			System.out.println(str);
		}
		
//		for(String str : list) {
//			if(str.equals("three")) { //문자열이 같은지를 비교하려면 equals를 써야됨
//				
//			}
//		}
		
		System.out.println("three 문자열 존재여부 판단 : " + list.contains("three"));
		list.remove("three");
		System.out.println("three 문자열 존재여부 판단 : " + list.contains("three"));
		
		System.out.println("list : " + list);
		List<String> subList = new ArrayList<String>();
		subList.add("하나");
		subList.add("둘");
		subList.add("셋");
		list.addAll(subList);
		System.out.println("addAll() 후 list : " + list);
	}

}
