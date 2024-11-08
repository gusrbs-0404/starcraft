package Starcraft;

abstract class Unit {
	final int MAX_HP;
	final int MAX_MP;
	int hp;
	int mp;
	String name;
	
	Unit(String name, int hp, int mp){
		MAX_HP = hp;
		MAX_MP = mp;
		this.hp = hp;
		this.mp = mp;
		this.name = name;
		
		System.out.println(name + "이 생성되었습니다.");
	}
	
	@Override
	public String toString() {
		String massgae = String.format("[%s] | [HP : %d/%d | MP : %d/%d] ", name, hp, MAX_HP, mp, MAX_MP);
		return 	massgae;
	}
}
