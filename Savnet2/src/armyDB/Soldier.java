package armyDB;

public class Soldier {
	private String name;
	private int firePower;
	private static final int SOLDIERFP = 1;

	public Soldier(String name) {
		this.name = name;
		this.firePower = computeFirePower(SOLDIERFP);
	}

	private int computeFirePower(int x) {
		return 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
}