package Wildcards;

import java.util.ArrayList;
import java.util.List;

//import Substutianlprincple.Building; // dont keep unnesscery imports it will make code error




public class Mainclassforwildcards 
{
	public static void main(String[] args)
	{

		// list of bulinds
		List<Building>buildingss=new ArrayList<Building>();
		buildingss.add(new Building());
		buildingss.add(new Building());
		//buildingss.add(new Office());
		//buildingss.add(new Hoiuosw());
		printBuilding(buildingss);// called method with aruguments  so it will call only that partcualr we need to pass ? extends so iot will take its subtypes

		// list of offices


		List<Office>OFFICES=new ArrayList<Office>();
		OFFICES.add(new Office());
		//OFFICES.add(new Building());// we can to add it schild classss
		OFFICES.add(new Office());
		//printBuilding(OFFICES);// here it will not take becuse in ptint method we have passed Building
		printBuilding(OFFICES);
		addofficeList(OFFICES);// becuse we are passed super for this method
		addofficeList(OFFICES);

		// list houses   
		List<Hoiuosw>houses=new ArrayList<Hoiuosw>();
		houses.add( new Hoiuosw());

		houses.add(new Hoiuosw());
		//printBuilding(houses);// here it will not take becuse in ptint method we have passed Building
		printBuilding(houses);
addHouseList(houses);// becuse we are passed super for this method it will reprtesnt its parent class
addHouseList(buildingss);
	}
	
	static void printBuilding(List<? extends Building> cons) {// THIS METHOD FOR OUTPUT
		for (int i = 0; i < cons.size(); i++) {
			System.out.println(cons.get(i).toString()+i+1+";");
			// invirble becuse it owns method we can sue xtedbndss its parent
		}
		System.out.println();
	}
	// how to make ? super 
	static void addHouseList(List<? super Hoiuosw> nana) {// JUST TAKEN THUIS METHOD SHOW SUBCHILD CLASS HOW TO PASS WILDCADS
		nana.add(new Hoiuosw());
		System.out.println();// ouvirable becsue its not paernt we can take esuper
	}
	// its not neccsary
	static void addofficeList(List<? super Office> mana) {// JUST TAKEN THUIS METHOD SHOW SUBCHILD CLASS HOW TO PASS WILDCADS
		mana.add(new Office());
		System.out.println();// ouvirable becsue its not paernt we can take esuper
	}
	//o/p
//	bulind01;
//	bulind11;
//
//	 it office01;
//	 it office11;
//
//
//
//	houseing01;
//	houseing11;

}