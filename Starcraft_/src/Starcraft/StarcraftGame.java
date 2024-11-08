package Starcraft;

import java.util.Scanner;

public class StarcraftGame {
	private final static int ACTION = 1;
	private final static int REPAIR = 2;

	private final static int TANK = 1;
	private final static int MARIN = 2;
	private final static int SCV = 3;
	private final static int CARRIER = 4;
	private final static int CORSAIR = 5;
	private final static int EXIT = 0;

	private static Scanner scan = new Scanner(System.in);

	private static int log = -1;

	private static boolean isUint = true;
	private static boolean isAction = true;

	private void StarcaftGame() {

	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public static void run() {
		newUnit();
		while (isUint) {
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
		System.out.println("0)종료");

		int select = input("유닛 선택");

		if (select == TANK) {
			log = TANK;
			actionMenu();

		} else if (select == MARIN) {
			log = MARIN;
			actionMenu();
		} else if (select == SCV) {
			log = SCV;
			actionMenu();
		} else if (select == CARRIER) {
			log = CARRIER;
			actionMenu();
		} else if (select == CORSAIR) {
			log = CORSAIR;
			actionMenu();
		} else if (select == EXIT) {
			System.out.println("스타크래프트 종료!");
			isUint = false;
		}

		log = -1;
	}

	private static void actionMenu() {
		System.out.println("1.공격");
		System.out.println("2.회복");

		int select = input("메뉴 선택");

		if (select == ACTION) {
			action();
		} else if (select == REPAIR) {
			repair();
		}
	}

	private static void action() {

	}

	private static void repair() {

	}

	private static int input(String msg) {
		System.out.print(msg + " : ");
		String input = "";

		input = scan.nextLine();
		int number = -1;
		try {
			number = Integer.parseInt(input);
			return number;
		} catch (Exception e) {
			System.err.println("숫자로 입력하세요.");
		}

		return number;
	}
}
