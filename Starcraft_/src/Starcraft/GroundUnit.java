package Starcraft;

abstract class GroundUnit extends Unit{

	GroundUnit(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	
}

class Tank extends GroundUnit implements Repairable{

	Tank() {
		super("TANK", 200, 100);
	}
	
}

class Marin extends GroundUnit implements Repairable{

	Marin() {
		super("MARIN", 100, 80);
	}

}

class SCV extends GroundUnit implements Repairable{

	SCV() {
		super("SCV", 50, 50);
	}

}

