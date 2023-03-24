package kr.ac.kpo.day0323.abs2;

public class CastMain01 {
	
	public static void print(Parent p) {
		
		System.out.println(p instanceof Child01); // p가 가르키고 있는 객체가 Child01형인지 묻는것 -> 맞을경우 true 
		
		if(p instanceof Child01) {
			Child01 c01 = (Child01)p;
			c01.sleep();
			c01.study();
		} else if(p instanceof Child02) {
			Child02 c02 = (Child02)p;
			c02.game();
			c02.sing();
		}
		p.info();
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
//		print(new Child02());
//		print(new Parent());
		
		
		
		
//		Child01 c01 = new Child01();
//		c01.info();
//		
//		Child02 c02 = new Child02();
//		c02.info();
//		
//		Parent p = new Parent();
//		p.info();
		

		
		
/*		
		Child01 c01 = new Child01();
		c01.info();
		c01.sleep();
		c01.study();
		
		Parent p = new Child01();
		p.info();
//		p.sleep(); //접근불가
//		p.study();

 */
		
	}

}
