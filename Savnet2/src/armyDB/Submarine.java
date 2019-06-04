package armyDB;

public class Submarine {
	private String name;
	private int nrTorpedoes;
	private int firePower;

	public Submarine(String name, int nrTorpedoes) {
		this.name = name;
		this.nrTorpedoes = nrTorpedoes;
		this.firePower = computeFirePower(nrTorpedoes);
	}

	private int computeFirePower(int nrTorpedoes) {
		return 500 * nrTorpedoes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTorpedoesNr() {
		return nrTorpedoes;
	}

	public void setTorpedoesNr(int projectilesNr) {
		this.nrTorpedoes = projectilesNr;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
}