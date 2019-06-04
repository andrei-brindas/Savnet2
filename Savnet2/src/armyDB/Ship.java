package armyDB;

public class Ship {

	private String name;
	private int nrCanons;
	private int nrRockets;
	private int firePower;

	public Ship(String name, int nrCanons, int nrRockets) {
		this.name = name;
		this.nrCanons = nrCanons;
		this.nrRockets = nrRockets;
		this.firePower = computeFirePower(nrCanons, nrRockets);
	}

	private int computeFirePower(int projectilesNr, int bulletsNr) {
		return 100 * nrCanons + 1000 * nrRockets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCanonsNr() {
		return nrCanons;
	}

	public void setCanonsNr(int projectilesNr) {
		this.nrCanons = projectilesNr;
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
