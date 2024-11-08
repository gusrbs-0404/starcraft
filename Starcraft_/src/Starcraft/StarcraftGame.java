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

	static Tank tank;
	static Marin marine;
	static SCV scv;
	static Carrier carrier;
	static Corsair corsair;

	private void StarcaftGame() {

	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public static void run() {
		newUnit();
		while (isUint) {
			game();
		}
	}

	public static void newUnit() {
		tank = new Tank();
		System.out.println(tank);

		marine = new Marin();
		System.out.println(marine);

		scv = new SCV();
		System.out.println(scv);

		carrier = new Carrier();
		System.out.println(carrier);

		corsair = new Corsair();
		System.out.println(corsair);
	}

	private static void printUint() {
		System.out.println("1)탱크");
		System.out.println("2)마린");
		System.out.println("3)SCV");
		System.out.println("4)케리어");
		System.out.println("5)커세어");
	}

	private static void game() {
		printUint();
		System.out.println("0)종료");
		int select = input("유닛 선택");

		if (select == TANK) {
			log = TANK;
			actionMenu(tank);
		} else if (select == MARIN) {
			log = MARIN;
			actionMenu(marine);
		} else if (select == SCV) {
			log = SCV;
			actionMenu(scv);
		} else if (select == CARRIER) {
			log = CARRIER;
			actionMenu(carrier);
		} else if (select == CORSAIR) {
			log = CORSAIR;
			actionMenu(corsair);
		} else if (select == EXIT) {
			System.out.println("스타크래프트 종료!");
			isUint = false;
		}

		log = -1;
	}

	private static void actionMenu(Unit unit) {
		System.out.println("1.공격");
		System.out.println("2.회복");

		int select = input("메뉴 선택");

		if (select == ACTION) {
			action(unit);
		} else if (select == REPAIR) {
			if (log == SCV) {
				repair(unit); // SCV만 선택
			} else {
				System.out.println("회복 불가능!");
			}
		}
	}

	private static void action(Unit unit) {
		if (unit instanceof Unit) {
			printUint();
			int select = input("공격할 유닛 선택");

			if (select == log) {
				System.out.println("자신을 공격할 수 없습니다.");
				return;
			}

			if (select == TANK) {

			} else if (select == MARIN) {

			} else if (select == SCV) {

			} else if (select == CARRIER) {

			} else if (select == CORSAIR) {

			} else if (select == EXIT) {

			}

		} else {
			System.out.println("공격할 수 없음");
		}

	}

	private static void repair(Unit unit) {

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
