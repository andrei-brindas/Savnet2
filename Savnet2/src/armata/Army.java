package armata;

import java.util.List;

import armyDB.Plane;
import armyDB.Ship;
import armyDB.Soldier;
import armyDB.Submarine;
import armyDB.Tank;

public class Army {

	List<Soldier> soldiersList;
	List<Tank> tanksList;
	List<Ship> warshipsList;
	List<Submarine> submarinsList;
	List<Plane> warplanesList;

	public Army(Integer soldiersNr, Integer tanksNr, Integer warshipsNr, Integer submarinsNr, Integer warplanesNr) {
		DefaultArmyService defaultArmyService = new DefaultArmyService();
		this.soldiersList = defaultArmyService.buildSoldiersArmy(soldiersNr);
		this.tanksList = defaultArmyService.buildTanksArmy(tanksNr);
		this.warshipsList = defaultArmyService.buildWarshipsList(warshipsNr);
		this.submarinsList = defaultArmyService.buildSubmarinesList(submarinsNr);
		this.warplanesList = defaultArmyService.buildWarplanesList(warplanesNr);
	}

	public List<Soldier> getSoldiersList() {
		return soldiersList;
	}

	public void setSoldiersList(List<Soldier> soldiersList) {
		this.soldiersList = soldiersList;
	}

	public List<Tank> getTanksList() {
		return tanksList;
	}

	public void setTanksList(List<Tank> tanksList) {
		this.tanksList = tanksList;
	}

	public List<Ship> getWarshipsList() {
		return warshipsList;
	}

	public void setWarshipsList(List<Ship> warshipsList) {
		this.warshipsList = warshipsList;
	}

	public List<Submarine> getSubmarinsList() {
		return submarinsList;
	}

	public void setSubmarinsList(List<Submarine> submarinsList) {
		this.submarinsList = submarinsList;
	}

	public List<Plane> getWarplanesList() {
		return warplanesList;
	}

	public void setWarplanesList(List<Plane> warplanesList) {
		this.warplanesList = warplanesList;
	}
}
