package fiksturOlustur;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Team {
	public static Random rnd = new Random();
	
	// tüm takımların ismini tutar.
	ArrayList<String> teams = new ArrayList<>();
	
	// ilk maçların eşleşmelerini tutar
	Set<String> playedMatchesFirsRound = new LinkedHashSet<>();
	
	//rövanş maçlarının eşleşmelerini tutar
	Set<String> playedMatchesSecondRound = new LinkedHashSet<>();
	
	//daha önce maç yapan takımları saklar. Böylece rövanş maçları gelmeden takımlar tekrar karşılaşamaz.
	ArrayList<String> coupleTeams = new ArrayList<>();
	
	public void printLeagueFixture() {

		// takım sayısının tek çift durumunu kontrol et
		if (teams.size() % 2 != 0) {
			teams.add("Bay");
		}

		// takımları yazdır
		System.out.println("Takımlar: ");
		for (String team : teams) {
			System.out.print(team + "   ");
		}
		System.out.println("\n");

		matchRound();

	}

	public void matchRound() {
		
		ArrayList<String> home = new ArrayList<>();
		ArrayList<String> away = new ArrayList<>();
			
		for(int i = 0; i < teams.size()-1; i++) {
			home.clear();
			away.clear();
			
			//Ev sahibi takımları belirler.
			while(home.size() < teams.size()/2) {
				
				String homeTeam = teams.get(rnd.nextInt(teams.size()));
				String awayTeam = teams.get(rnd.nextInt(teams.size()));
				
				if((! homeTeam.equals(awayTeam))) {//Rastgele çekilen 2 takım aynı değilse
					
					//Takımlar daha önce karşılaşmadıysa
					if(coupleTeams.contains(homeTeam+awayTeam)== false && coupleTeams.contains(awayTeam+homeTeam)== false) {
						
						//Ve takımlar o hafta maç yapmadıysa
						if(home.contains(homeTeam)== false && away.contains(awayTeam)== false) {
							
							home.add(homeTeam);
							away.add(awayTeam);
							coupleTeams.add(awayTeam+homeTeam);
							coupleTeams.add(homeTeam+awayTeam);
							
							//O maçı ekle
							playedMatchesFirsRound.add(homeTeam+" vs "+awayTeam);
							//Rövanş maçını ekle
							playedMatchesSecondRound.add(awayTeam+" vs "+homeTeam);
						}
						
					}

				}
				
			}

		}//for burada bitiyor.
		
		int brace = 0 ;
		int week = 1;
		
		System.out.println("----- İlk Maçlar ------");
		
		System.out.println(week+". Hafta Maçları: ");
		for(String s : playedMatchesFirsRound) {
			System.out.println(s);
			brace++;
			if(brace == teams.size()/2) {
				System.out.println();
				brace=0;
				week++;
				System.out.println(week+". Hafta Maçları: ");
			}
		}
		System.out.println("----- Rövanş maçları -----");
		for(String s : playedMatchesSecondRound) {
			System.out.println(s);
			brace++;
			if(brace == teams.size()/2) {
				System.out.println();
				brace=0;
				week++;
				if(week <= (teams.size()-1)*2) {//Week değeri hafta sayısına küçük eşitse, haftanın maçlarını yazdır.
					System.out.println(week+". Hafta Maçları: ");
				}
			}
		}
		
	}
}
