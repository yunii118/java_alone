package ch06.sec05.practice3;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
	}

}
