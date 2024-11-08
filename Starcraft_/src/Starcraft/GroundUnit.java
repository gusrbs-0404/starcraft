package Starcraft;

abstract class GroundUnit extends Unit {

	GroundUnit(String name, int hp, int mp) {
		super(name, hp, mp);
	}

}

class Tank extends GroundUnit implements Repairable {

	Tank() {
		super("TANK", 200, 100);
	}

}

class Marin extends GroundUnit implements Repairable {

	Marin() {
		super("MARIN", 100, 80);
	}

}

class SCV extends GroundUnit implements Repairable {

	SCV() {
		super("SCV", 50, 50);
	}

	void repair(Readable unit) {
		if (unit instanceof Unit) {
			Unit target = (Unit) unit;
			while (target.hp < target.MAX_HP) {
				System.out.println(target + "|| 회복중");
				target.hp++;
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
			}
			System.out.println("<<< 회복 완료 >>> ");
		}
	}

}
