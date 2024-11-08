package Starcraft;

public class StarcraftGame {

	final int TANK = 1;
	final int Marin = 2;
	final int SCV = 3;
	final int Carrier = 4;
	final int Corsair = 5;

	private void StarcaftGame() {

	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public static void run() {
		newUnit();
		while (true) {
			printUint();
		}
	}

	private static void newUnit() {
		Tank tank = new Tank();
		Marin marine = new Marin();
		SCV scv = new SCV();
		Carrier carrier = new Carrier();
		Corsair corsair = new Corsair();
	}

	private static void printUint() {
		System.out.println("1)탱크");
		System.out.println("2)마린");
		System.out.println("3)SCV");
		System.out.println("4)케리어");
		System.out.println("5)커세어");
	}

}
