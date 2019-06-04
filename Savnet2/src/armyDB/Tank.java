package armyDB;

public class Tank {
	private String name;
	private int projectilesNr;
	private int bulletsNr;
	private int firePower;

	public Tank(String name, int projectilesNr, int bulletsNr) {
		this.name = name;
		this.projectilesNr = projectilesNr;
		this.bulletsNr = bulletsNr;
		this.firePower = computeFirePower(projectilesNr, bulletsNr);
	}

	private int computeFirePower(int projectilesNr, int bulletsNr) {
		return projectilesNr * 50 + bulletsNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProjectilesNr() {
		return projectilesNr;
	}

	public void setProjectilesNr(int projectilesNr) {
		this.projectilesNr = projectilesNr;
	}

	public int getBulletsNr() {
		return bulletsNr;
	}

	public void setBulletsNr(int bulletsNr) {
		this.bulletsNr = bulletsNr;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
}