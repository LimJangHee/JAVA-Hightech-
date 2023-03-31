package kr.ac.kpo.day0331.inputoutputAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.ac.kpo.util.FileClose;

public class FileIOMain02 {

	// iotest/Koala.jpg 파일을 iotest.Koala2.jpg에 복사
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("iotest/koala.jpg");
			fos = new FileOutputStream("iotest/Koala2.jpg");

			long start = System.currentTimeMillis();

			while (true) {
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}

			fos.flush(); // 출력 바이트 스트림에 남아 있는 정보를 끝까지 다 보내게 하는 메소드, 출력만 관련있음
			long end = System.currentTimeMillis();

			System.out.println("Koala2.jpg에 복사완료...");

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally { // 사용하고 있는 동안 다른 사용자가 사용을 못하기 때문에 권한을 넘겨주기 위해서 close를 해줘야됨

			FileClose.close(fis);
			FileClose.close(fos);
			
//			if (fis != null) {
//				try {
//				fis.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if (fos != null) {
//				try {
//				fos.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
	}

}
