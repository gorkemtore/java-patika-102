public class Main {

	public static void main(String[] args) {
		Academician ac1 = new Academician("Görkem", "TÖRE", "5111111111", "gorkemtore1@gmail.com",
				"Information Tech.", "Engineer");
		//ac1.diningHall();
		//ac1.attendClass();
		
		Assistant as1 = new Assistant("Pınar", "Yılmaz", "03129571829", "pinar@gmail.com",
				"Medical Faculty", "Medic","10.00-12.00");
		
		//as1.doQuiz();
		
		LabAssistant labAs = new LabAssistant("Hatice", "Solmaz", "423423432", "hatice@dev.com",
				"Chemistry", "Chemist","09.00-17.00");
		
		//labAs.attendLab();
		OfficerIT officerIT = new OfficerIT("Hasan", "Kara", "4422312312", "hasan@kara.com", "IT", "10.00-19.00", "Networker");
		
		//officerIT.networkSetup();
		

	}

}
