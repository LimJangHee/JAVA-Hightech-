package kr.ac.kpo.day0331.inputoutputAPI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kpo.util.FileClose;

public class FileIOMain04 {
	
	public static void write() {
		
		//dataIO.txt에 데이터 저장
		FileOutputStream fos = null;
		DataOutputStream dos = null; //필터 클래스
		
		try {
			fos = new FileOutputStream("iotest/dataIO.txt");
			dos = new DataOutputStream(fos);
			
			int a = 59;
			char b = 'M';
			int c = 109;
			double d = 12.34;
			
			dos.writeInt(a);
			dos.writeChar(b);
			dos.writeInt(c);
			dos.writeDouble(d);
			dos.flush();
			
			
			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			FileClose.close(dos, fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null; //필터클래스
		
		try {
			fis = new FileInputStream("iotest/dataIo.txt");
			dis = new DataInputStream(fis);
			
			//저장한 순서대로 불러와서 읽어야 됨
			int a = dis.readInt();
			char b = dis.readChar();
			int c = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("< 읽어온 결과 >");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			System.out.println("d : " + d);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
	
	public static void main(String[] args) {
		
		read();
		
	}

}
