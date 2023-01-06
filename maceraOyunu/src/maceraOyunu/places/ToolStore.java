package maceraOyunu.places;

import java.util.Arrays;

@SuppressWarnings("unused")
public class ToolStore extends NormalLocation{

	@Override
	boolean onLocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Locations() {
		// TODO Auto-generated method stub
		
	}
	
	public void menu() {
		String[] guns = {"Tabanca","Kılıç","Tüfek"};
		int [][] gunDetails = {{1,2,25},{2,3,35},{3,7,45}};
		System.out.println("Silahlar: ");
		for(int i = 0 ;i<guns.length;i++) {
			System.out.print(guns[i]+ "\tDetails(id, damage, price) : "+ Arrays.toString(gunDetails[i]));
			System.out.println();
			
		}		
		
	}
	public void buy() {
		
	}

}
