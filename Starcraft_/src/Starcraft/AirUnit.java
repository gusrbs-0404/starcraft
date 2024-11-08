package Starcraft;

abstract class AirUnit extends Unit {

	AirUnit(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	abstract void fluing();
}
