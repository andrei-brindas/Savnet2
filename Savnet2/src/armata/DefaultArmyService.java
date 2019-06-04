package armata;

import java.util.ArrayList;
import java.util.List;

import armyDB.Plane;
import armyDB.Ship;
import armyDB.Soldier;
import armyDB.Submarine;
import armyDB.Tank;

public class DefaultArmyService implements ArmyService {

	private static final String NAME_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public DefaultArmyService() {
	}

	@Override
	public List<Soldier> buildSoldiersArmy(Integer soldiersNr) {
		List<Soldier> generateSoldiersList = new ArrayList<>();
		for (int i = 0; i < soldiersNr; i++) {
			generateSoldiersList.add(new Soldier(randomName(5)));
		}
		return generateSoldiersList;
	}

	@Override
	public List<Plane> buildWarplanesList(Integer warplanesNr) {
		List<Plane> generateWarplanesList = new ArrayList<>();
		for (int i = 0; i < warplanesNr; i++) {
			generateWarplanesList.add(new Plane(randomName(5), 10, 20));
		}
		return generateWarplanesList;
	}

	@Override
	public List<Submarine> buildSubmarinesList(Integer submarinsNr) {
		List<Submarine> generateSubmarinesList = new ArrayList<>();
		for (int i = 0; i < submarinsNr; i++) {
			generateSubmarinesList.add(new Submarine(randomName(5), 15));
		}
		return generateSubmarinesList;
	}

	@Override
	public List<Ship> buildWarshipsList(Integer warshipsNr) {
		List<Ship> generateWarshipsList = new ArrayList<>();
		for (int i = 0; i < warshipsNr; i++) {
			generateWarshipsList.add(new Ship(randomName(5), 3, 50));
		}
		return generateWarshipsList;
	}

	@Override
	public List<Tank> buildTanksArmy(Integer tanksNr) {
		List<Tank> generateTanksList = new ArrayList<>();
		for (int i = 0; i < tanksNr; i++) {
			generateTanksList.add(new Tank(randomName(5), 3, 50));
		}
		return generateTanksList;
	}

	private static String randomName(int count) {

		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * NAME_STRING.length());
			builder.append(NAME_STRING.charAt(character));
		}
		return builder.toString();
	}
}