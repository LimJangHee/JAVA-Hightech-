package kr.ac.kpo.day0331.inputoutputAPI;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kpo.util.FileClose;

public class FileIOMain03 { //유틸패키지에 close클래스 참조
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			 fis = new FileInputStream("iotest/Koala/jpg");
			 bis = new BufferedInputStream(fis); //필터 클래스
			
			 fos = new FileOutputStream("iotest/Koala3.jpg");
			 bos = new BufferedOutputStream(fos);//필터 클래스
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("Koala3.jpg에 복사완료...");
			
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //버퍼를 먼저 닫아주고 파일을 닫아줘야됨
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
			
//			FileClose.close(bis);
//			FileClose.close(fis);
//			FileClose.close(bos);
//			FileClose.close(fos);
			
		}
	}

}
