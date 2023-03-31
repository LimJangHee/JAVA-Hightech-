package kr.ac.kpo.day0331.inputoutputAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// iotest/FileIOMain02.java.txt ==> iotest/FileIOMain02-1.java.txt 복사

public class FileIOMain05 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader("iotest/FileIOMain02.java.txt");
			fw = new FileWriter("iotest/FileIOMain02.java.txt");

			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			while (true) {
				String data = br.readLine();
				if (data == null)
					break;
				bw.write(data);
				bw.newLine(); //없으면 한줄로 쭉 찍힘
			}
			bw.flush();
			System.out.println("파일복사완료...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
