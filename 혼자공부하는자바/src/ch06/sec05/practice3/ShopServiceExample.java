package ch06.sec05.practice3;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은객체");
		}
		else {
			System.out.println("다른객체.");
		}

	}

}
