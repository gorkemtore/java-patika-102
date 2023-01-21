package fiksturOlustur;

public class Main {

	public static void main(String[] args) {
		Team team = new Team();
		team.teams.add("Fenerbahçe");
		team.teams.add("Beşiktaş");
		team.teams.add("Galatasaray");
		team.teams.add("Eskişehirspor");
		team.teams.add("Karşıyaka");
		team.teams.add("Bursaspor");

		team.printLeagueFixture();
		

	}

}
