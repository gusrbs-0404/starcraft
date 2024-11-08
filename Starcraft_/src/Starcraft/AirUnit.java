package Starcraft;

abstract class AirUnit extends Unit {

	AirUnit(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	abstract void fluing();
}

class Carrier extends AirUnit implements Attackble {

	Carrier() {
		super("CARRIER", 250, 150);
	}

	@Override
	void fluing() {
		System.out.println("공중 유닛!");
	}

	@Override
	public void attack(Unit unit) {
		// TODO Auto-generated method stub

	}

}

class Corsair extends AirUnit implements Attackble {

	Corsair() {
		super("CORSAIR", 150, 100);
	}

	@Override
	void fluing() {
		System.out.println("공중 유닛!");
	}

	@Override
	public void attack(Unit unit) {

	}

}
