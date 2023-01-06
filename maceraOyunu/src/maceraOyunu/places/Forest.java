package maceraOyunu.places;

public class Forest extends BattleLocation {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	boolean onLocation() {
		return true;
	}

	

	@Override
	void combat() {

	}

}
