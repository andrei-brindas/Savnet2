package armyDB;

public class Plane {

	private String name;
	private int nrBombs;
	private int nrRockets;
	private int firePower;

	public Plane(String name, int nrBombs, int nrRockets) {
		this.name = name;
		this.nrBombs = nrBombs;
		this.nrRockets = nrRockets;
		this.firePower = computeFirePower(nrBombs, nrRockets);
	}

	private int computeFirePower(int projectilesNr, int bulletsNr) {
		return 2000 * nrBombs + 1000 * nrRockets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBombsNr() {
		return nrBombs;
	}

	public void setBombsNr(int projectilesNr) {
		this.nrBombs = projectilesNr;
	}

	public int getRocketsNr() {
		return nrRockets;
	}

	public void setRocketsNr(int bulletsNr) {
		this.nrRockets = bulletsNr;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}

}
