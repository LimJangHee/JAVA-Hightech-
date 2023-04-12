package kr.ac.kpo.day0412;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import kr.ac.kpo.util.FileClose;

/*
 		$ FileIOMain07  a.jpg b.jpg
 		run configurations -> arguments에서 대상 파일을 위치와 명을 지정해줘야됨
 		
 		a.txt b.txt -> args배열에 각각 저장됨
 */

public class FileIOMain07 {

	public static void main(String[] args) {
		
		if(args.length != 2) {// args배열에 a,b파일이 생성되어서 2개가 아닐경우 잘 못 되었다고 출력
			
			System.out.println("==============================================");
			System.out.println("\t명령어가 잘못되었습니다");
			System.out.println("\tjava FileIOMain07  원본파일명  대상파일명");
			System.out.println("==============================================");
			System.exit(0);		
		}
		
		File sourceFile = new File(args[0]); //args 0번째 (복사대상) 객체를 생성
		if(!sourceFile.exists() || !sourceFile.isFile()) { //파일이 존재하지 않거나 파일이 아닐경우
			System.out.println(args[0] + "파일은 존재하지 않습니다");
			System.exit(0);
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			
			fis = new FileInputStream(sourceFile);//위에서 생성한 객체를 사용
			fos = new FileOutputStream(args[1]);//복사를 받을 파일은 객체 생성을 안했기 때문에 args배열로 직접 지정 
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			System.out.println(args[0] + "파일을 " 
						+ args[1] + "파일에 복사완료하였습니다");
			
		} catch (FileNotFoundException e) {
			System.out.println(args[0] + "파일은 존재하지 않습니다");
			System.exit(0);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		}
		
	}
}
