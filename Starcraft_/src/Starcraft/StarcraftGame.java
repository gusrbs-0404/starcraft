package Starcraft;

public class StarcraftGame {

	private void StarcaftGame() {

	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public static void run() {
		newUnit();
	}
	
	private static void newUnit() {
		Tank tank = new Tank();
		Marin marine = new Marin();
		SCV scv = new SCV();
		Carrier carrier = new Carrier();
		Corsair corsair = new Corsair();
	}
}
