package armata;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DefaultBattleService implements BattleService {
	private Army one;
	private Army two;

	public DefaultBattleService(Army one, Army two) {
		this.one = one;
		this.two = two;
	}

	@Override
	public boolean battle() {
		boolean fightSoldiers = false;
		if ((!one.getSoldiersList().isEmpty()) && (!two.getSoldiersList().isEmpty())) {
			fightSoldiers = battleSoldiers();
		}

		boolean fightTanks = false;
		if ((!one.getTanksList().isEmpty()) && (!two.getTanksList().isEmpty())) {
			fightTanks = battleTanks();
		}

		boolean fightWarships = false;
		if ((!one.getWarshipsList().isEmpty()) && (!two.getWarshipsList().isEmpty())) {
			fightWarships = battleShips();
		}

		boolean fightSubmarins = false;
		if ((!one.getSubmarinsList().isEmpty()) && (!two.getSubmarinsList().isEmpty())) {
			fightSubmarins = battleSubmarines();
		}

		boolean fightWarplanes = false;
		if ((!one.getWarplanesList().isEmpty()) && (!two.getWarplanesList().isEmpty())) {
			fightWarplanes = battlePlanes();
		}

		displayStatus();

		if (fightSoldiers || fightTanks || fightWarships || fightSubmarins || fightWarplanes) {
			return true;
		} else {
			System.out.println("Battle end!");
			return false;
		}
	}

	@Override
	public boolean battleSoldiers() {

		DefaultArmyService defaultArmyService = new DefaultArmyService();
		Integer firstArmySoldiers = one.getSoldiersList().size();
		Integer secondArmySoldiers = two.getSoldiersList().size();
		BigDecimal remainFirstArmySoldiers = BigDecimal.valueOf(firstArmySoldiers - secondArmySoldiers * Math.random());
		BigDecimal remainSecondArmySoldiers = BigDecimal
				.valueOf(secondArmySoldiers - firstArmySoldiers * Math.random());
		if (remainFirstArmySoldiers.intValue() > 0) {
			one.setSoldiersList(defaultArmyService.buildSoldiersArmy(remainFirstArmySoldiers.intValue()));
		} else {
			one.setSoldiersList(new ArrayList<>());
			return false;
		}
		if (remainSecondArmySoldiers.intValue() > 0) {
			two.setSoldiersList(defaultArmyService.buildSoldiersArmy(remainSecondArmySoldiers.intValue()));
		} else {
			two.setSoldiersList(new ArrayList<>());
			return false;
		}
		return true;
	}

	@Override
	public boolean battleTanks() {

		DefaultArmyService defaultArmyService = new DefaultArmyService();
		Integer firstArmyTanks = one.getTanksList().size();
		Integer secondArmyTanks = two.getTanksList().size();
		BigDecimal remainFirstArmyTanks = BigDecimal.valueOf(firstArmyTanks - secondArmyTanks * Math.random());
		BigDecimal remainSecondArmyTanks = BigDecimal.valueOf(secondArmyTanks - firstArmyTanks * Math.random());
		if (remainFirstArmyTanks.intValue() > 0) {
			one.setTanksList(defaultArmyService.buildTanksArmy(remainFirstArmyTanks.intValue()));
		} else {
			one.setTanksList(new ArrayList<>());
			return false;
		}
		if (remainSecondArmyTanks.intValue() > 0) {
			two.setTanksList(defaultArmyService.buildTanksArmy(remainSecondArmyTanks.intValue()));
		} else {
			two.setTanksList(new ArrayList<>());
			return false;
		}
		return true;
	}

	@Override
	public boolean battleShips() {
		DefaultArmyService defaultArmyService = new DefaultArmyService();
		Integer firstArmyShips = one.getWarshipsList().size();
		Integer secondArmyShips = two.getWarshipsList().size();
		BigDecimal remainFirstArmyShips = BigDecimal.valueOf(firstArmyShips - secondArmyShips * Math.random());
		BigDecimal remainSecondArmyShips = BigDecimal.valueOf(secondArmyShips - firstArmyShips * Math.random());
		if (remainFirstArmyShips.intValue() > 0) {
			one.setWarshipsList(defaultArmyService.buildWarshipsList(remainFirstArmyShips.intValue()));
		} else {
			one.setWarshipsList(new ArrayList<>());
			return false;
		}
		if (remainSecondArmyShips.intValue() > 0) {
			two.setWarshipsList(defaultArmyService.buildWarshipsList(remainSecondArmyShips.intValue()));
		} else {
			two.setWarshipsList(new ArrayList<>());
			return false;
		}
		return true;
	}

	@Override
	public boolean battleSubmarines() {
		DefaultArmyService defaultArmyService = new DefaultArmyService();
		Integer firstArmySubmarines = one.getSubmarinsList().size();
		Integer secondArmySubmarines = two.getSubmarinsList().size();
		BigDecimal remainFirstArmySubmarines = BigDecimal
				.valueOf(firstArmySubmarines - secondArmySubmarines * Math.random());
		BigDecimal remainSecondArmySubmarines = BigDecimal
				.valueOf(secondArmySubmarines - firstArmySubmarines * Math.random());
		if (remainFirstArmySubmarines.intValue() > 0) {
			one.setSubmarinsList(defaultArmyService.buildSubmarinesList(remainFirstArmySubmarines.intValue()));
		} else {
			one.setSubmarinsList(new ArrayList<>());
			return false;
		}
		if (remainSecondArmySubmarines.intValue() > 0) {
			two.setSubmarinsList(defaultArmyService.buildSubmarinesList(remainSecondArmySubmarines.intValue()));
		} else {
			two.setSubmarinsList(new ArrayList<>());
			return false;
		}
		return true;
	}

	@Override
	public boolean battlePlanes() {
		DefaultArmyService defaultArmyService = new DefaultArmyService();
		Integer firstArmyPlanes = one.getWarplanesList().size();
		Integer secondArmyPlanes = two.getWarplanesList().size();
		BigDecimal remainFirstArmyPlanes = BigDecimal.valueOf(firstArmyPlanes - secondArmyPlanes * Math.random());
		BigDecimal remainSecondArmySubmarines = BigDecimal.valueOf(secondArmyPlanes - firstArmyPlanes * Math.random());
		if (remainFirstArmyPlanes.intValue() > 0) {
			one.setWarplanesList(defaultArmyService.buildWarplanesList(remainFirstArmyPlanes.intValue()));
		} else {
			one.setWarplanesList(new ArrayList<>());
			return false;
		}
		if (remainSecondArmySubmarines.intValue() > 0) {
			two.setWarplanesList(defaultArmyService.buildWarplanesList(remainSecondArmySubmarines.intValue()));
		} else {
			two.setWarplanesList(new ArrayList<>());
			return false;
		}
		return true;
	}

	@Override
	public void displayStatus() {
		System.out.println("\n----------\n");
		System.out.println("Army one vs Army two");
		System.out.println("\n----------\n");
		System.out.println(
				"Army one tanks: " + one.getTanksList().size() + " vs Army two tanks: " + two.getTanksList().size());

		System.out.println("Army one ships: " + one.getWarshipsList().size() + " vs Army two ships: "
				+ two.getWarshipsList().size());

		System.out.println("Army one planes: " + one.getWarplanesList().size() + " vs Army two planes: "
				+ two.getWarplanesList().size());

		System.out.println("Army one submarines: " + one.getSubmarinsList().size() + " vs Army two submarines: "
				+ two.getSubmarinsList().size());

		System.out.println("Army one soldiers: " + one.getSoldiersList().size() + " vs Army two soldiers: "
				+ two.getSoldiersList().size());
	}

}