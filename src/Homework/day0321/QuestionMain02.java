package Homework.day0321;

public class QuestionMain02 {
	
	public static void main(String[] args) {
		
		ScannerUtil02 scan = new ScannerUtil02();
		Icecream ice = new Icecream();
		
		int num = scan.ask("아이스크림 몇개 구입할래?");
		String[] name = new String[num];
		int[] price = new int[num];
		

		
		for(int i=1; i <= num; i++) {
			System.out.println("*** " + i +"번째 아이스크림 구매 정보 입력 ***");
			name[i-1] = ice.name("아이스크림명 : ");
			price[i-1] = ice.price("아이스크림가격 : ");	
		}
		
		System.out.println(" < 총 " + num + "개의 아이스크림 구매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i=1; i <= num; i++) {
			System.out.print(i + "\t");
			System.out.print(name[i-1] + "\t" + "\t");
			System.out.print(price[i-1] + "\n");
		}
	}

}
