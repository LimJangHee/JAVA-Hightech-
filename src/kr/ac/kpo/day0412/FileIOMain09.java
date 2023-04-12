package kr.ac.kpo.day0412;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kpo.util.FileClose;

public class FileIOMain09 {
	
	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 20, "010-1111-2222"); //객체 단위이기 때문에 UserInfo쪽에서 객체 직렬화를 해줘야됨
																// implements Serializable
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; //객체 단위로 저장
		
		try {
			
			fos = new FileOutputStream("iotest/userInfo.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.flush();
			
			System.out.println("userInfo.dat 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}
	
	public static void read() {
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			try {
				fis = new FileInputStream("iotest/userInfo.dat");
				ois = new ObjectInputStream(fis);
				
				UserInfo user = (UserInfo)ois.readObject();
				
				System.out.println(user);
						
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				FileClose.close(ois,fis);
			}
		}
	
	
	
	public static void main(String[] args) {
		
		read();
		//wirte();
		
	}

}
