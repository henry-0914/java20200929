package chap06.textbook.exercises;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService( ) {}
	
	static ShopService getInstance( ) {
		return shopService;
	}
}
