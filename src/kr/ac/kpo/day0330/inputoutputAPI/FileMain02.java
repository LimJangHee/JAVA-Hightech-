package kr.ac.kpo.day0330.inputoutputAPI;

import java.io.File;

public class FileMain02 {
	
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		System.out.println("------------------------");
		System.out.println(dirObj.getPath() + " 폴더");
		System.out.println("--------------------------");
		String[] dataArr = dirObj.list(); //해당 디렉토리에 있는 모든 폴더와 파일을 배열 형태로 알려줌
		for(String data : dataArr) {
			System.out.println(data);
		}
		System.out.println("------------------------");
		
//		File dirObj = new File("iotest/오리");
//		
//		dirObj.mkdir(); //directory가 없을시 생성해줌, 단 바로 하위일 경우에만
//		dirObj.mkdirs();//없는 directory를 모두 만들어줌
		
	}

}
