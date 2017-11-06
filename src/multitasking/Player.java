package multitasking;

import java.util.ArrayList;

public class Player {
	private int hp = 100;
	private int numberOfBullets = 0;
	private int damage = 0;
	private String name;
	private int stamina = 100;
	private ArrayList inventory; 
	
	private static int fistDamage = 5;

	public Player(String name) {
		this.name = name;

		// returnes the name of the player
		// string name

	}

	public String getName() {
		return this.name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}

	public int getFistdamage() {
		return fistDamage;
	}
public void setFistDamage( int fistDamage) {
	Player.fistDamage =fistDamage;
	}
}

