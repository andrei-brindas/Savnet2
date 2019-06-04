package armata;

import java.util.List;

import armyDB.Plane;
import armyDB.Ship;
import armyDB.Soldier;
import armyDB.Submarine;
import armyDB.Tank;

public interface ArmyService {

	public List<Soldier> buildSoldiersArmy(Integer soldiersNr);

	public List<Plane> buildWarplanesList(Integer warplanesNr);

	public List<Submarine> buildSubmarinesList(Integer submarinsNr);

	public List<Ship> buildWarshipsList(Integer warshipsNr);

	public List<Tank> buildTanksArmy(Integer tanksNr);

}
