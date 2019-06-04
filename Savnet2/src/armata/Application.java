package armata;

public class Application {

	public static void main(String[] args) {
		Army one = new Army(4, 9, 2, 6, 8);
		Army two = new Army(6, 1, 9, 4, 5);
		DefaultBattleService defaultBattleService = new DefaultBattleService(one, two);
		defaultBattleService.battle();
	}
}