package Starcraft;

abstract class AirUnit extends Unit {

	AirUnit(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	abstract void fluing();
}

class Carrier extends AirUnit {

	Carrier() {
		super("CARRIER", 250, 150);
	}

	@Override
	void fluing() {
		System.out.println("공중 유닛!");
	}

}

class Corsair extends AirUnit {

	Corsair() {
		super("CORSAIR", 150, 100);
	}

	@Override
	void fluing() {
		System.out.println("공중 유닛!");
	}

}
