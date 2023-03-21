package Homework.day0321;

public class StringUtil {

	public static int checkChar(String strdata, char ch) {

		int count = 0;
		char[] arr = strdata.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
			}
		}
		return count;
	}

	public static String removeChar(String oriStr, char delChar) {

		String Arr = "";
		for (int i = 0; i < oriStr.length(); i++) {
			if (delChar != oriStr.charAt(i)) {
				Arr += oriStr.charAt(i);
			}
		}
		
		return Arr;
	}

}
